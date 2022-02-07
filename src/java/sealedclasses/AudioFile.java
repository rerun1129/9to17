package sealedclasses;


/**
 * from java 17
 */
public sealed abstract class AudioFile permits MP3File {

    //sealed 클래스의 서브 클래스는 반드시 sealed, non-sealed, final 지시자 중에 하나를 가져야 한다.


}
