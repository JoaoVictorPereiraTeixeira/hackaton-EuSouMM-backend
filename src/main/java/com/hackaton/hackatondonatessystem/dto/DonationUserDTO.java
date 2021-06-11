package com.hackaton.hackatondonatessystem.dto;

import com.hackaton.hackatondonatessystem.domain.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonationUserDTO {

    private Long id;

    private MemberDTO donor;

    private String title;

    private String description;

    private String donationDate;

    private Long value;

    private SectorDTO sector;

    private CauseDTO cause;

    public DonationUserDTO(UserDonation donation) {
        this.id = donation.getId();
        this.title = donation.getTitle();
        this.description = donation.getDescription();
        this.donationDate = donation.getDonationDate();
        this.value = donation.getValue();

        this.donor =  new MemberDTO(donation.getDonor());
        this.sector = new SectorDTO(donation.getSector());
        this.cause = new CauseDTO(donation.getCause());
    }
}
