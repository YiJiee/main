package seedu.address.model.group;

/**
 * GroupRemark of a Group.
 */
public class GroupRemark {
    public final String remark;

    public GroupRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return remark;
    }

    /**
     * Checks if this GroupRemark is equal to other GroupRemark.
     * @param other to be compared
     * @return boolean
     */
    public boolean equals(GroupRemark other) {
        if (other == null) {
            return false;
        } else if (other.toString().equals(this.remark)) {
            return true;
        } else {
            return false;
        }
    }
}
