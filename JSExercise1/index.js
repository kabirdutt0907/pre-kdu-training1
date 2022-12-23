var topAnswer = parseInt(document.querySelector("h1").textContent);

document.querySelectorAll("button")[0].addEventListener("click", function(){
    topAnswer += 1;
    document.querySelector("h1").textContent = topAnswer;
});

document.querySelectorAll("button")[1].addEventListener("click", function(){
    topAnswer -= 1;
    document.querySelector("h1").textContent = topAnswer;
});
