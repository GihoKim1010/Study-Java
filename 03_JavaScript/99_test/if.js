var r= Math.floor(Math.random()*6)+1;

if(r==1){                    //== 은 좌변과 우변이 같은가? 를 묻는 조건문.
    document.write("대실패");
}else if(r==2){
    document.write("실패");
}else if(r==3){
    document.write("성공");
}else{                       //필요 없으면 else는 없어도 됨.
    document.write("대성공")
}