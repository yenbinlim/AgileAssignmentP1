/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var slideIndex = 1;
showSlides11(slideIndex);

// Next/previous controls
function plusSlides11(n) {
  showSlides11(slideIndex += n);
}

// Thumbnail image controls
function currentSlide11(n) {
  showSlides11(slideIndex = n);
}

function showSlides11(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides11");
  var dots = document.getElementsByClassName("dot11");
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
