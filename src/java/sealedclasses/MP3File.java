package sealedclasses;


public sealed class MP3File extends AudioFile permits ExtendedMP3File {
        //해당 클래스가 final 인 경우에는 상속이 불가능하기 때문에 상속을 하려고 한다면 sealed 나 non-sealed 지시자를 선택해야한다.
        //해당 클래스가 sealed 인 경우에 이 클래스가 서브 클래스를 가질 경우에는 permits 지시자를 통해서 (모든)서브 클래스를 허용해줘야 한다.
        //sealed 클래스는 반드시 서브 클래스를 하나 이상 가져야 한다.
        //non-sealed 클래스는 sealed 제한이 없는 지시자이고 sealed 의 체인을 끊어내기 위해서 사용할 수 있다.

}
