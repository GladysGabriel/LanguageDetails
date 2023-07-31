package org.lang;

public class StateDetails {
 private void southIndia() {
	 System.out.println("SpeaksTamil");
 }
 public void northIndia() {
	 System.out.println("SpeaksHindi");
 }
 public static void main(String[] args) {
	StateDetails s= new StateDetails();
	LanguageInfo l= new LanguageInfo();
	s.southIndia();
	s.northIndia();
	l.tamilLanguage();
	l.englishLanguage();
	l.hindiLanguage();
}

}
