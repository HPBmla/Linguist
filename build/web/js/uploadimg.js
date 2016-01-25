/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* name of InputFile variable, name of hiddenVariable, id of img tag, extension, maximumSize */
function imageUpload(inputName, hiddenName, imgId, extension, maxSize) {

    var rootLoc = '/Viseur';
    var data = new FormData();
    data.append('imageupload', inputName.files[0]);
    data.append('maxsize', maxSize);
    data.append('extension', extension);

    jQuery.ajax({
        url: rootLoc + '/UploadImageServlet',
        data: data,
        cache: false,
        contentType: false,
        processData: false,
        type: 'POST',
        success: function (result) {
            var json = jQuery.parseJSON(result);
            if (json.success) {
                $("#" + imgId).attr('src', rootLoc + json.imgUrl);
                $("input[name='" + hiddenName + "']").attr('value', json.img);
            }
            else {
                alertModal(alertType.Error, json.error);
            }
        }
    });

}

function appendDisabled(inputName) {
    $("input[name='" + inputName + "']").attr('disabled', 'disabled');
}