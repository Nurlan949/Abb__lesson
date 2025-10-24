package practices_1.practice_3;

public enum DaysOfWeek {
    SENTYABR("SEPTEMBER"), OKTYABR("OCTOBER"), NOYABR("NOVEMBER"), DEKABR("DEKABR"), YANVAR("YANVAR"), FEVRAL("FEVRAL"), MART("MART"), IYUN("IYUN"), IYUL("IYUL"), AVQUST("AVQUST");
    private String nameOfIng;

    DaysOfWeek(String nameOfIng) {
        this.nameOfIng = nameOfIng;
    }

    public String getNameOfIng() {
        return nameOfIng;
    }
}
