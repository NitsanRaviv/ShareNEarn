package model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String faceBookId;
    private String name;
    private List<Earn> earnList;

    public User() {}

    public String getFaceBookId() {
        return faceBookId;
    }

    public void setFaceBookId(String faceBookId) {
        this.faceBookId = faceBookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    public List<Earn> getEarnList() {
        return earnList;
    }

    public void setEarnList(List<Earn> earnList) {
        this.earnList = earnList;
    }

    public void addEarn(Earn earn){
        if(this.earnList == null)
            this.earnList = new ArrayList<Earn>();
        this.earnList.add(earn);
    }

    public boolean isOfferPublished(int offerId) {
        if(earnList != null) {
            return this.earnList.stream()
                    .filter(earn -> earn.getOfferId() == offerId)
                    .count() > 0;
        }
        return false;
    }
}
