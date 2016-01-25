/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var alertType = {Error: "Error", Information: "Information", Success: "Success", Default: "Message"};

function alertTitleModal(modalType, title, msg) {

    var headerClass = 'modal-header text-';
    var buttonClass = 'btn btn-';

    switch (modalType)
    {
        case "Error":
            headerClass += 'danger';
            buttonClass += 'danger';
            break;
        case "Information":
            headerClass += 'info';
            buttonClass += 'info';
            break;
        case "Success":
            headerClass += 'primary';
            buttonClass += 'primary';
            break;
        default:
            headerClass += "muted";
            buttonClass += "default";
            break;
    }

    $('#alert-msg-title').html(title);
    $('#alert-msg-body').html(msg);
    $('#alert-msg-header').attr('class', headerClass);
    $('#alert-msg-button').attr('class', buttonClass);
    $('#alert-msg-modal').modal('show');
}

function alertModal(modalType, msg) {
    alertTitleModal(modalType, modalType.toString(), msg);
}