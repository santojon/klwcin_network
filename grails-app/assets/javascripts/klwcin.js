var urlPath;

function init(url) {
	urlPath = url;
}

function getUrlPath(){
	return urlPath;
}

function setActive(controllerName){
	$( '#'+ controllerName + 'Menu').addClass('active').parent().parent().addClass('active');
}

function changeActive(active, inactive) {
	$('#'+ active).addClass('active');
	$('#'+ inactive).removeClass('active');
}

setTimeout(function () {
	  $('.alert-dismissible').alert('close')
}, 15000)

function goToIndexPage(controllerName) {
	window.location = getUrlPath() + "/" + controllerName;
}

//remove modal related functions
function showModal(modalName) {
	$(modalName).modal('show');
}


/**
* User related functions
*/
function getRemoveUserModalByUserName(userName, userId){
	showModal('#remove-user');
	$('#userName').html(userName);
	$('button[type="submit"]', '#remove-user').click( function() {
		$('#remove-form-' + userId).submit();
	});
}

//edit user
function editUser(id) {
	window.location = getUrlPath() + "/user/edit/" + id;
}


/**
* Meeting related functions
*/
function getRemoveMeetingModalByPlaceAndDate(meetingPlace, meetingDate, meetingId){
	showModal('#remove-meeting');
	$('#meetingPlace').html(meetingPlace);
	$('#meetingDate').html(meetingDate);
	$('button[type="submit"]', '#remove-meeting').click( function() {
		$('#remove-form-' + meetingId).submit();
	});
}

//edit user
function editMeeting(id) {
	window.location = getUrlPath() + "/meeting/edit/" + id;
}

//participate in meeting
function participate(id) {
	window.location = getUrlPath() + "/meeting/goToMeeting/" + id;
}