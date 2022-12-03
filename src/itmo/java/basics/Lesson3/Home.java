package itmo.java.basics.Lesson3;

import java.util.Calendar;

public class Home {
    int FloorCount;
    int BuildingYear;
    String name;

    public Home(int floorCount, int buildingYear, String name) {
        FloorCount = floorCount;
        BuildingYear = buildingYear;
        this.name = name;
    }

    public int getFloorCount() {
        return FloorCount;
    }

    public void setFloorCount(int floorCount) {
        FloorCount = floorCount;
    }

    public int getBuildingYear() {
        return BuildingYear;
    }

    public void setBuildingYear(int buildingYear) {
        BuildingYear = buildingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Home{" +
                "FloorCount=" + FloorCount +
                ", BuildingYear=" + BuildingYear +
                ", name='" + name + '\'' +
                '}';
    }

    public int GetAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - BuildingYear;
    }
}



