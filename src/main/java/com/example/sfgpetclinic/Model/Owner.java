package com.example.sfgpetclinic.Model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person{
    @Builder
    public Owner(String address, String city, String telephone, Set<Pet> pets) {
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    protected boolean canEqual(final Object other) {
        return other instanceof Owner;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Owner)) return false;
        final Owner other = (Owner) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$telephone = this.getTelephone();
        final Object other$telephone = other.getTelephone();
        if (this$telephone == null ? other$telephone != null : !this$telephone.equals(other$telephone)) return false;
        final Object this$pets = this.getPets();
        final Object other$pets = other.getPets();
        if (this$pets == null ? other$pets != null : !this$pets.equals(other$pets)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $telephone = this.getTelephone();
        result = result * PRIME + ($telephone == null ? 43 : $telephone.hashCode());
        final Object $pets = this.getPets();
        result = result * PRIME + ($pets == null ? 43 : $pets.hashCode());
        return result;
    }

    public String toString() {
        return "Owner(address=" + this.getAddress() + ", city=" + this.getCity() + ", telephone=" + this.getTelephone() + ", pets=" + this.getPets() + ")";
    }
}
