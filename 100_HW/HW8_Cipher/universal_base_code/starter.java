/*
 *	Author: Terence Jung
 *  Date: 10/18/26
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String code1 = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
        System.out.println("Code 1: " + code1);
		String code2 = Cipher.encode("sv8vq17r 1r q25 85rq");
        System.out.println("Code 2: " + code2);
		String code3 = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
        System.out.println("Code 3: " + code3);
		String code4 = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
        System.out.println("Code 4: " + code4);
		String code5 = Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
        System.out.println("Code 5: " + code5);
		String code6 = Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8);
        System.out.println("Code 6: " + code6);
		String code71 = Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13);
		String code72 = Cipher.keyedEncode(code71, 29);
		System.out.println("Code 7: " + code72);
		String code8 = Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw");
        System.out.println("Code 8: " + code8);
		
		//the hard ones
		System.out.println();
		int key1 = 0;
		while (key1 < 36){
			System.out.println(key1 + ": " + Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", key1));
			key1 = key1 + 1;
		}
		// after checking all the outputs, 27 is the key for code 9
		System.out.println();
		int key2 = 0;
		while (key2 < 36){
			System.out.println(key2 + ": " + Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", key2));
			key2 = key2 + 1;
		}
		// after checking all the outputs, 16 is the key for code 10

		System.out.println();
		System.out.println();
		String code9 = Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27);
        System.out.println("Code 9: " + code9);
		String code10 = Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16);
        System.out.println("Code 10: " + code10);
	}
}
