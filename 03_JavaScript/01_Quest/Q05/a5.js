var random;
random = Math.floor(Math.random() * 100) + 1; // 1 ~ n 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.

for (var x= 1; x <= random; x = x + 1) {
    document.write("<img src='cat.jpg'>");
}

// { } 를 '코드 블럭' 이라고 부른다.

