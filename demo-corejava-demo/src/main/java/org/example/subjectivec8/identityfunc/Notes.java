package org.example.subjectivec8.identityfunc;

public class Notes {
    public String tagName;
    public Integer tagId;

    @Override
    public String toString() {
        return "Notes{" +
                "tagName='" + tagName + '\'' +
                ", tagId=" + tagId +
                ", sequence=" + sequence +
                '}';
    }

    public Integer sequence;
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public Notes(Integer sequence,String tagName, Integer tagId ) {
        this.tagName = tagName;
        this.tagId = tagId;
        this.sequence = sequence;
    }

}
