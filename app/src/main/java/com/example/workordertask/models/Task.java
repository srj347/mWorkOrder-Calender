package com.example.workordertask.models;

public class Task {

    public final static int TYPE11 = 0;
    public final static int TYPE12 = 1;
    public final static int TYPE13 = 2;
    public final static int TYPE14 = 3;
    public final static int TYPE15 = 4;
    public final static int TYPE16 = 5;
    public final static int TYPE17 = 6;
    public final static int TYPE21 = 7;
    public final static int TYPE22 = 8;
    public final static int TYPE23 = 9;
    public final static int TYPE24 = 10;
    public final static int TYPE25 = 11;
    public final static int TYPE26 = 12;
    public final static int TYPE31 = 13;
    public final static int TYPE32 = 14;
    public final static int TYPE33 = 15;
    public final static int TYPE34 = 16;
    public final static int TYPE35 = 17;
    public final static int TYPE41 = 18;
    public final static int TYPE42 = 19;
    public final static int TYPE43 = 20;
    public final static int TYPE44 = 21;
    public final static int TYPE51 = 22;
    public final static int TYPE52 = 23;
    public final static int TYPE53 = 24;
    public final static int TYPE61 = 25;
    public final static int TYPE62 = 26;
    public final static int TYPE71 = 27;


    String workOrderId, workName, companyName;
    Integer priority;
    Integer startDay, startMonth, startYear;
    Integer endDay, endMonth, endYear;
    int type;


    public Task(String workOrderId, String workName, String companyName, Integer priority) {
        this.workOrderId = workOrderId;
        this.workName = workName;
        this.companyName = companyName;
        this.priority = priority;
    }

    public Task(String workOrderId, Integer priority, Integer startDay, Integer endDay){
        this.workOrderId = workOrderId;
        this.priority = priority;
        this.startDay = startDay;
        this.endDay = endDay;
        setType();
    }

    public void setType(){
        int taskLength = getTaskLength();
        switch (startDay){
            case 1:
                setLengthForDay1(taskLength);
                break;
            case 2:
                setLengthForDay2(taskLength);
                break;
            case 3:
                setLengthForDay3(taskLength);
                break;
            case 4:
                setLengthForDay4(taskLength);
                break;
            case 5:
                setLengthForDay5(taskLength);
                break;
            case 6:
                setLengthForDay6(taskLength);
                break;
            case 7:
                setLengthForDay7(taskLength);
                break;
        }
    }

    private void setLengthForDay1(int taskLength) {
        switch (taskLength){
            case 1:
                type = TYPE11;
                break;
            case 2:
                type = TYPE12;
                break;
            case 3:
                type = TYPE13;
                break;
            case 4:
                type = TYPE14;
                break;
            case 5:
                type = TYPE15;
                break;
            case 6:
                type = TYPE16;
                break;
            case 7:
                type = TYPE17;
                break;
        }
    }

    private void setLengthForDay2(int taskLength) {
        switch (taskLength){
            case 1:
                type = TYPE21;
                break;
            case 2:
                type = TYPE22;
                break;
            case 3:
                type = TYPE23;
                break;
            case 4:
                type = TYPE24;
                break;
            case 5:
                type = TYPE25;
                break;
            case 6:
                type = TYPE26;
                break;
        }
    }

    private void setLengthForDay3(int taskLength) {
        switch (taskLength){
            case 1:
                type = TYPE31;
                break;
            case 2:
                type = TYPE32;
                break;
            case 3:
                type = TYPE33;
                break;
            case 4:
                type = TYPE34;
                break;
            case 5:
                type = TYPE35;
                break;
        }
    }

    private void setLengthForDay4(int taskLength) {
        switch (taskLength){
            case 1:
                type = TYPE41;
                break;
            case 2:
                type = TYPE42;
                break;
            case 3:
                type = TYPE43;
                break;
            case 4:
                type = TYPE44;
                break;
        }
    }

    private void setLengthForDay5(int taskLength) {
        switch (taskLength){
            case 1:
                type = TYPE51;
                break;
            case 2:
                type = TYPE52;
                break;
            case 3:
                type = TYPE53;
                break;
        }
    }

    private void setLengthForDay6(int taskLength) {
        switch (taskLength){
            case 1:
                type = TYPE61;
                break;
            case 2:
                type = TYPE62;
                break;
        }
    }

    private void setLengthForDay7(int taskLength) {
        switch (taskLength){
            case 1:
                type = TYPE71;
                break;
        }
    }


    public Integer getTaskLength(){
        return endDay - startDay + 1;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public Integer getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Integer startMonth) {
        this.startMonth = startMonth;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndDay() {
        return endDay;
    }

    public void setEndDay(Integer endDay) {
        this.endDay = endDay;
    }

    public Integer getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(Integer endMonth) {
        this.endMonth = endMonth;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
