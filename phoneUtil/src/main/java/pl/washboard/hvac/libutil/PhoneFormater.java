package pl.washboard.hvac.libutil;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

public class PhoneFormater {
    private static final PhoneNumberUtil PHONE_NUMBER_UTIL = PhoneNumberUtil.getInstance();

    public String national(String str) {
        try {
            Phonenumber.PhoneNumber NumberProto = PHONE_NUMBER_UTIL.parse(str, "PL");
            return PHONE_NUMBER_UTIL.format(NumberProto, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
        } catch (NumberParseException e) {
            return str;
        }
    }

    public String international(String str) {
        try {
            Phonenumber.PhoneNumber NumberProto = PHONE_NUMBER_UTIL.parse(str, "PL");
            return PHONE_NUMBER_UTIL.format(NumberProto, PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
        } catch (NumberParseException e) {
            return str;
        }
    }

    public PhoneNumberUtil.PhoneNumberType getType(String str) {
        try {
            Phonenumber.PhoneNumber NumberProto = PHONE_NUMBER_UTIL.parse(str, "PL");
            return PHONE_NUMBER_UTIL.getNumberType(NumberProto);
        } catch (NumberParseException e) {
            return null;
        }
    }
}
