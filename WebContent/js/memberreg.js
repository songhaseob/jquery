/**
 * 
 */

//공백체크
function idcheck() {
	idvalue = $('#id').val().trim();
	
	if(idvalue.length < 1){
		alert("아이디 입력하세요");
		return false;
	}
	// 아이디 길이 4 ~ 12
	if(idvalue.length < 4 || idvalue.length > 12){
		alert("아이디 4 ~ 8사이");
		return false;
	}
	// 아이디 정규식 - 소문자로 시작하고 대문자와 숫자로 조합
	idreg = /^[a-z][a-zA-Z0-9]{3,7}$/;
	if(!(idreg.test(idvalue))){ //아이디 value가 idreg에 맞는가?
		alert("아이디 형식오류");
		return false;
	} 
	
	return true;
}

function regcheck(){
	// 이름, 공백, 길이, 정규식
	
	// 비밀번호 - 공백, 길이, 정규식
	
	// 전화번호 - 공백 정규식
	
	// 이메일 - 공백 정규식
	
	return true;
}