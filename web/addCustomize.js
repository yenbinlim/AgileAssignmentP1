/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



function output(){
var style;
var size;
var flower = '';
var accessory = '';

if(document.getElementById('aa1').checked){
     style = 'arrangement style 1';
     
     if(document.flowers.f1.checked){
     flower =  flower + ' flower type 1.';
}if(document.flowers.f2.checked){
     flower =  flower + ' flower type 2.';
} if(document.flowers.f3.checked){
     flower =  flower + ' flower type 3.';
}if(document.flowers.f4.checked){
     flower =  flower + ' flower type 4.';
} if(document.flowers.f5.checked){
     flower =  flower + ' flower type 5.';
}if(document.flowers.f6.checked){
     flower =  flower + ' flower type 6.';
} if(document.flowers.f7.checked){
     flower =  flower + ' flower type 7.';
} if(document.flowers.f8.checked){
     flower =  flower + ' flower type 8.';
}if(document.flowers.f9.checked){
     flower =  flower + ' flower type 9.';
} if(document.flowers.f10.checked){
     flower =  flower + ' flower type 10.';
}if(document.flowers.f11.checked){
     flower =  flower + ' flower type 11.';
}if(document.flowers.f12.checked){
     flower =  flower + ' flower type 12.';
}if(document.flowers.f13.checked){
     flower =  flower + ' flower type 13.';
} if(document.flowers.f14.checked){
     flower =  flower + ' flower type 14.';
} if(document.flowers.f15.checked){
     flower =  flower + ' flower type 15.';
}


}else if(document.getElementById('aa2').checked){
     style = 'arrangement style 2';
     
     if(document.flowerssss.ff1.checked){
     flower =  flower + ' flower type 1.';
}if(document.flowerssss.ff2.checked){
     flower =  flower + ' flower type 3.';
} if(document.flowerssss.ff3.checked){
     flower =  flower + ' flower type 6.';
}if(document.flowerssss.ff4.checked){
     flower =  flower + ' flower type 7.';
} if(document.flowerssss.ff5.checked){
     flower =  flower + ' flower type 9.';
}if(document.flowerssss.ff6.checked){
     flower =  flower + ' flower type 11.';
} if(document.flowerssss.ff7.checked){
     flower =  flower + ' flower type 13.';
} if(document.flowerssss.ff8.checked){
     flower =  flower + ' flower type 14.';
}


}else if(document.getElementById('aa3').checked){
     style = 'arrangement style 3';
}else if(document.getElementById('aa4').checked){
     style = 'arrangement style 4';
}else if(document.getElementById('aa5').checked){
     style = 'arrangement style 5';
}else if(document.getElementById('aa6').checked){
     style = 'arrangement style 6';
}else if(document.getElementById('aa7').checked){
     style = 'arrangement style 7';
}else if(document.getElementById('aa8').checked){
     style = 'arrangement style 8';
}else if(document.getElementById('aa9').checked){
     style = 'arrangement style 9';
}else if(document.getElementById('aa10').checked){
     style = 'arrangement style 10';
}else if(document.getElementById('aa11').checked){
     style = 'arrangement style 11';
}else if(document.getElementById('aa12').checked){
     style = 'arrangement style 12';
}else if(document.getElementById('aa13').checked){
     style = 'arrangement style 13';
}else if(document.getElementById('aa14').checked){
     style = 'arrangement style 14';
}else if(document.getElementById('aa15').checked){
     style = 'arrangement style 15';
}else{
     style = 'no selected style';
}

if(document.getElementById('s1').checked){
     size = 'small';
}else if(document.getElementById('s2').checked){
     size = 'medium';
}else if(document.getElementById('s3').checked){
     size = 'large';
}else{
     size = 'no selected size';
}



if(document.accessories.a1.checked){
     accessory =  accessory + ' accessory type 1.';
}if(document.accessories.a2.checked){
     accessory =  accessory + ' accessory type 2.';
} if(document.accessories.a3.checked){
     accessory =  accessory + ' accessory type 3.';
}if(document.accessories.a4.checked){
     accessory =  accessory + ' accessory type 4.';
} if(document.accessories.a5.checked){
     accessory =  accessory + ' accessory type 5.';
}if(document.accessories.a6.checked){
     accessory =  accessory + ' accessory type 6.';
} if(document.accessories.a7.checked){
     accessory =  accessory + ' accessory type 7.';
} if(document.accessories.a8.checked){
     accessory =  accessory + ' accessory type 8.';
}if(document.accessories.a9.checked){
     accessory =  accessory + ' accessory type 9.';
} if(document.accessories.a10.checked){
     accessory =  accessory + ' accessory type 10.';
}if(document.accessories.a11.checked){
     accessory =  accessory + ' accessory type 11.';
}if(document.accessories.a12.checked){
     accessory =  accessory + ' accessory type 12.';
}if(document.accessories.a13.checked){
     accessory =  accessory + ' accessory type 13.';
} if(document.accessories.a14.checked){
     accessory =  accessory + ' accessory type 14.';
} if(document.accessories.a15.checked){
     accessory =  accessory + ' accessory type 15.';
}

document.write('<html><head>');
        
document.write('<title>Customize Flower</title>');
document.write('<link rel="shortcut icon" href="icon.ico">');
document.write('<meta charset="UTF-8">');
document.write('<meta name="viewport" content="width=device-width, initial-scale=1.0">');
document.write('</head>');
document.write('<body style="background-color: bisque">');
document.write('<h3>You have selected the following items for your customize bouquet.</h3>');
document.write('<br/>Selected arrangement style : ' + style);
document.write('<br/><br/> Selected size : ' + size);
document.write('<br/><br/> Selected flowers : ' + flower);
document.write('<br/><br/> Selected accessories : ' + accessory);
document.write('</body></html>');
}
