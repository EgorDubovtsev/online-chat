$(document).ready(function (){
        $("#send").click(()=>sendMessage());
});
function sendMessage(){
const text = $("#messageField").val();//TODO: maybe return time
let login = document.cookie.split('=')[1];
alert(document.cookie);
$.getJSON("/api/sendMessage",{
    userFrom:login,
    messageText:text
},(response)=>{

})
    $(".messageBox").append(
    '<div class="message">'+
'      	<div class="messageAuthor">'+login+'</div>'+
'      	<div class="messageText">'+text+'</div>'+
'      	<div class="messageDate">12:02</div>'+
'   </div>'
    );
    $('#messageField').val("");//add insert into db
}
