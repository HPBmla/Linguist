/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function rateConcept(val, id, rate) {

    var rootLoc = '/Viseur';
    var data = {};

    data['itemtype'] = val;
    data['itemid'] = id;
    data['rate'] = rate;

    var wasBuzzed = document.getElementById("buzzItem").disabled;
    var wasArched = document.getElementById("archiveItem").disabled;
    var buzzedE = $("#buzzedTimes");
    var archedE = $("#archivedTimes");

    jQuery.ajax({
        url: rootLoc + '/RateItem',
        data: data,
        type: 'POST',
        success: function (result) {
            rs = parseInt(result);
            if (rs === 1) {
                if (wasBuzzed) {
                    buzzedE.html(parseInt(buzzedE.html()) - 1);
                    archedE.html(parseInt(archedE.html()) + 1);
                }
                else if (wasArched) {
                    buzzedE.html(parseInt(buzzedE.html()) + 1);
                    archedE.html(parseInt(archedE.html()) - 1);
                }
                else if (rate) {
                    buzzedE.html(parseInt(buzzedE.html()) + 1);
                }
                else if (!rate) {
                    archedE.html(parseInt(archedE.html()) + 1);
                }
                document.getElementById("buzzItem").disabled = rate;
                document.getElementById("archiveItem").disabled = !rate;
            }
            else {
                alertModal(alertType.Information, "Please try again.");
            }
        }
    });

}


function addComment(val, id, textName, idToAppend) {

    var rootLoc = '/Viseur';
    var text = $("input[name='" + textName + "']").val();

    var data = {};
    data['itemtype'] = val;
    data['itemid'] = id;
    data['comment'] = text;
    $("input[name='" + textName + "']").val("");

    jQuery.ajax({
        url: rootLoc + '/AddComment',
        data: data,
        type: 'POST',
        cache: false,
        success: function (result) {
            var json = jQuery.parseJSON(result);
            if (parseInt(json.success) === 1) {
                //json.id
                var htmlComment = '<strong class="pull-left primary-font"> ' + json.userName + ' </strong><small class="pull-right text-muted">';
                htmlComment += ' ' + json.time + ' </small> </br><li class="ui-state-default"> ' + text + ' </li></br>';
                $("#" + idToAppend).prepend(htmlComment);
            }
            else {
                alertModal(alertType.Error, json.error);
            }
        },
        error: function (data) {
            alert("Error" + data.toString());
        }
    });
}
