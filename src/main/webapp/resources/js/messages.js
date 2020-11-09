$(document).ready(function (){
    scrollDown();
    $("#send").click(()=>sendMessage());
    setInterval( () =>  loadMessages(), 4000);



});
function sendMessage(){
const text = $("#messageField").val();
let login = document.cookie.split('=')[1];
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
    $('#messageField').val("");
    scrollDown();
}
function loadMessages(){
    let lastMessage = $(".messageText:last").text();
    $.getJSON("/api/messages",
        {
            lastMessageText:lastMessage
        },(response)=>{
        console.log(response);
            for(let i = 0;i<response.length;i++){
                    $(".messageBox").append(
                    '<div class="message">'+
                '      	<div class="messageAuthor">'+response[i].senderLogin+'</div>'+
                '      	<div class="messageText">'+response[i].messageText+'</div>'+
                '      	<div class="messageDate">12:02</div>'+
                '   </div>'
                    );
            }
        });

}
function scrollDown(){
    let messageBody = document.querySelector('.messageBox');
    messageBody.scrollTop = messageBody.scrollHeight - messageBody.clientHeight;
}