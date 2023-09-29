package module8SOLID.builder.exercise2;

import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
public final class BirthInfo {
    private final LocalDate birthday;
    private final LocalTime birthTime;
    private final String birthPlace;
    private final Double weight;
    private final Double height;

    public BirthInfo(LocalDate birthday, LocalTime birthTime, String birthPlace, Double weight, Double height) {
        this.birthday = birthday;
        this.birthTime = birthTime;
        this.birthPlace = birthPlace;
        this.weight = weight;
        this.height = height;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public LocalTime getBirthTime() {
        return this.birthTime;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Double getHeight() {
        return this.height;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BirthInfo)) return false;
        final BirthInfo other = (BirthInfo) o;
        final Object this$birthday = this.getBirthday();
        final Object other$birthday = other.getBirthday();
        if (this$birthday == null ? other$birthday != null : !this$birthday.equals(other$birthday)) return false;
        final Object this$birthTime = this.getBirthTime();
        final Object other$birthTime = other.getBirthTime();
        if (this$birthTime == null ? other$birthTime != null : !this$birthTime.equals(other$birthTime)) return false;
        final Object this$birthPlace = this.getBirthPlace();
        final Object other$birthPlace = other.getBirthPlace();
        if (this$birthPlace == null ? other$birthPlace != null : !this$birthPlace.equals(other$birthPlace))
            return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$height = this.getHeight();
        final Object other$height = other.getHeight();
        if (this$height == null ? other$height != null : !this$height.equals(other$height)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $birthday = this.getBirthday();
        result = result * PRIME + ($birthday == null ? 43 : $birthday.hashCode());
        final Object $birthTime = this.getBirthTime();
        result = result * PRIME + ($birthTime == null ? 43 : $birthTime.hashCode());
        final Object $birthPlace = this.getBirthPlace();
        result = result * PRIME + ($birthPlace == null ? 43 : $birthPlace.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $height = this.getHeight();
        result = result * PRIME + ($height == null ? 43 : $height.hashCode());
        return result;
    }

    public String toString() {
        return "BirthInfo(birthday=" + this.getBirthday() + ", birthTime=" + this.getBirthTime() + ", birthPlace=" + this.getBirthPlace() + ", weight=" + this.getWeight() + ", height=" + this.getHeight() + ")";
    }
}
