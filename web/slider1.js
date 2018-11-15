/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var slideIndex = 1;
showSlides1(slideIndex);

// Next/previous controls
function plusSlides1(n) {
  showSlides1(slideIndex += n);
}

// Thumbnail image controls
function currentSlide1(n) {
  showSlides1(slideIndex = n);
}

function showSlides1(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides1");
  var dots = document.getElementsByClassName("dot1");
  if (n > slides.length) {slideIndex = 1} 
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none"; 
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block"; 
  dots[slideIndex-1].className += " active";
}

function styleCheck() {
    if (document.getElementById('aa1').checked) {
        document.getElementById('flowerstyle1').style.display = 'none';
        document.getElementById('allflower').style.display = 'block';
    } else if(document.getElementById('aa2').checked){
        document.getElementById('flowerstyle1').style.display = 'block';
        document.getElementById('allflower').style.display = 'none';
    }else {
        document.getElementById('allflower').style.display = 'block';
        document.getElementById('flowerstyle1').style.display = 'none';
    }
}