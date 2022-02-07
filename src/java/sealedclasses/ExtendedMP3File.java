package sealedclasses;


public non-sealed class ExtendedMP3File extends MP3File {
    // 체인을 끊어낸다고 함은
    // sealed 클래스는 하위 클래스를 반드시 필요로 함
    // -> sealed 클래스가 하위 클래스를 가지면 해당 클래스는 반드시 permits 로 서브 클래스를 허용해줘야함.
    // -> 허용받은 서브 클래스는 반드시 지시자 final, non-sealed, sealed 중에 하나를 지시자로 가져야함.
    // -> 해당 클래스가 sealed 클래스가 되는 경우에 처음으로가서 반복함.

    // 이러한 일련의 과정을 끊어내기 위해서는 final 또는 non-sealed 지시자가 필요한데 final 은 상속이 불가한 한계가 있다.
    // 따라서 non-sealed 를 통해서 해당 서브 클래스에서 sealed 체인을 끊어낼 수 있는 것이다.

}
