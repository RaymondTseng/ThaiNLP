import cn.edu.kmust.seanlp.lexer.Lexer;


public class Test {
	public static void main(String[] args) {
		String text = "เชิงเพราะการแพทย์แผนปัจจุบันและการแพทย์เฉพาะทางที่ผูกขาดทั้งอำนาจและวิชาการ";
		String encoding = "UTF-8";
		String str = Lexer.thDualCRFSegmentationWord(text, encoding);  // 层叠CRF分词
		System.out.println(str);
		System.out.println(Lexer.thWordSegAndPOS(text, encoding));  //分词并词性标注
		System.out.println(Lexer.thPOS(str, encoding)); //分好词后在词性标注
		
		
	}
	
	

}
