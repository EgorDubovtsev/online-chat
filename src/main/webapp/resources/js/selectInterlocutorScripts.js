$(document).ready(function (){
    $("#search").click(()=>searchInterlocutor())
})
function searchInterlocutor(){
const nameOrLogin = $("searchLine").val()
$.getJSON("/api/Interlocutors",{
    name:nameOrLogin
},(response)=>{//create api for request
    //add this response on the page
})
}