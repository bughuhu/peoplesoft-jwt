package peoplesoft.jwt.utils;

public class JwtTokenUtilTest {

	public static void main(String[] args) {

		JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();

		String token = jwtTokenUtil.generateToken("15811393989", "111111");

		System.out.println("token:" + token);

		System.out.println("name:" + jwtTokenUtil.getUsernameFromToken(token));
		
		System.out.println("releate time:" + jwtTokenUtil.getIssuedAtDateFromToken(token));
		
		System.out.println("expiration time:" + jwtTokenUtil.getExpirationDateFromToken(token));
		
		System.out.println("audience from:" + jwtTokenUtil.getAudienceFromToken(token));
		
	}

}
