package Enums;

public enum Type {


    STRAT(1L),
    SUPERSTRAT(2L),
    EXPLORER(3L),
    CLASSIC(4L),
    BASS(5L);

    public Long id;

    Type(Long id){
        this.id = id;
    }

}
