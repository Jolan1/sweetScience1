package com.bnta4.sweetscience;

import java.util.ArrayList;
import java.util.List;

public class UserAnswerData {

    public List<UserAnswerData> list= new ArrayList <UserAnswerData>();


    public UserAnswerData(List<UserAnswerData> list) {
        this.list = list;
    }

    public List<UserAnswerData> getList() {
        return list;
    }

    public void setList(List<UserAnswerData> list) {
        this.list = list;
    }
}
