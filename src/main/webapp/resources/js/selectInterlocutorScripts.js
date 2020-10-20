$(document).ready(function (){
    $("#search").click(()=>searchInterlocutor())
})
function searchInterlocutor(){
$(".searchResults").html('');
console.log("search async");
const nameOrLogin = $("#searchLine").val()
console.log(nameOrLogin);
$.getJSON("/api/interlocutors",{
    name: nameOrLogin
},(response)=>{
    for(let i = 0;i<response.length;i++){
         $(".searchResults").append(
            "<button class='user'>"+
                "<div class='userPhoto'></div>"+
                "<div class='userName'>"+response[i].name+"</div>"+
                "<div class='userLogin'>"+response[i].login+"</div>"+
            "</button>")
    }

})
console.log("END");
}