package com.company.lesson8.lesson.models.university;

import com.company.lesson8.lesson.exceptions.MinistryException;
import com.company.lesson8.lesson.models.Country;
import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.utils.Logger;

public class MinistryOfEducation {
    private Country country;

    public MinistryOfEducation(Country country) {
        this.country = country;
    }

    public void validate(User user, University university) throws MinistryException {
        if (country == Country.USA) {
            if ( ! (university instanceof UsaUniversity)) {
                throw new MinistryException("We can't apply student of University of foreign country");
            }
        }

        if (country == Country.UKRAINE) {
            if ( ! (university instanceof UkrainianUniversity)) {
                throw new MinistryException("We can't apply student of University of foreign country");
            }
        }
        Logger.info(getClass().getSimpleName() + " validate user: " + user);
    }


}
