package book.thisIsCoding;

import Util.LogUtil;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grad = 'B';
        
        switch (grad) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                LogUtil.debug(SwitchCharExample.class,"디버그");
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
