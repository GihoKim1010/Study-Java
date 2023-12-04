var r= Math.floor(Math.random()*6)+1;

switch (r) {
    case 1:
        document.write("대실패");
        break;  // break : case를 순서대로 확인하다가, true값이 될 경우 그 case를 실행 후 switch 문을 빠져나감.
    case 2:
        document.write("실패");
        break;
    case 3:
        document.write("성공");
        break;
    default:  //그 외의 경우. else와 비슷한 용도. 필요 없는 경우엔 없어도 됨.
        document.write("대성공")
        break;
}