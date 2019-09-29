void setup(){
        size(400,400);  
PImage face = loadImage("Me.jpg");

face.resize(width, height);


image(face, 0, 0);
    
  
  
}

    void draw(){
fill(mouseY, 0, mouseX);
ellipse(186, 240, 40, 40);
   
 
 ellipse(245, 240, 40, 40);
 
 fill(#0A0606);
 ellipse(245,240, 15, 15);
 
 fill(#0A0606);
 ellipse(186,240, 15, 15);
 
 
 
 }
                    
                                 
