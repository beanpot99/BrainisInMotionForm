package com.brainsInMotion.brainsinmotionforms.controllers;

import com.brainsInMotion.brainsinmotionforms.models.*;
import com.brainsInMotion.brainsinmotionforms.models.clinicEnums.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("forms")
public class ClinicController {
    static HashMap<String, String> childSensoryTwoCategories = new HashMap<>();
    static HashMap<String, String> allTherapists = new HashMap<>();
    public ClinicController(){
        childSensoryTwoCategories.put("Seeking/Seeker","/95");
        childSensoryTwoCategories.put("Avoiding/Avoider","/100");
        childSensoryTwoCategories.put("Sensitivity/Sensor","/95");
        childSensoryTwoCategories.put("Registration/Bystander","/110");
        childSensoryTwoCategories.put("Auditory","/40");
        childSensoryTwoCategories.put("Visual","/30");
        childSensoryTwoCategories.put("Touch","/55");
        childSensoryTwoCategories.put("Movement","/40");
        childSensoryTwoCategories.put("Body Position","/40");
        childSensoryTwoCategories.put("Oral","/50");
        childSensoryTwoCategories.put("Conduct","/45");
        childSensoryTwoCategories.put("Social Emotional","/70");
        childSensoryTwoCategories.put("Attentional","/50");

        allTherapists.put("Kristi Warren, MOT, OT/L", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAZEAAAB+CAMAAADSmtyGAAAAjVBMVEX///8AAAD6+vr39/fz8/Pm5ubv7+/r6+v4+Pj8/PyxsbHQ0NDt7e3CwsKoqKjW1tbh4eGcnJyVlZV+fn4sLCxeXl69vb22trZQUFBLS0tFRUWkpKRwcHAxMTF3d3dBQUEaGhqHh4fLy8toaGg4ODghISGXl5eMjIxYWFiDg4MlJSV6enoQEBAXFxctLS2EkSqSAAAT4klEQVR4nO1dh3aqSBh2KBpAqkoRRAUUNJr3f7ydfwqMiiUJMfEu3zm7N0Gk/L3NZDDo0aNHjx49evTo0aNHjx49evTo0aNHjx49evTo0aNHx8hGv/0EPURIEULD84NKZv/Gs/z7GFoXtD6HtEAIOafHjBk+5v7UQ/0zeNPNz36lRMi/dw7WEITGwgFFX8IhVH32bh1ADYIXsqArhFotySiLXbntAxWkX7pz1RKIv6i/knmEQxgTfE1nig7rbzzyJ2GSe0+ed8PvwcEPa1wcVb09vMW05Qs2fGDduyz5+sL1vDIN94hjEcBnCvyYfP/RH4M/ZTd37p/7JwAcOdeR0YyT8FIVnIcsj4raENAPl0+0XaOQ3/w3rOWX4OOH9U7FRz8noQALDi/vXtWD0w5RNcuTdy+wydcSxt4U/xx28uz30bxKpD3plt8Gk6FovY3jrVeu04q9wjz1L18ih09md19OO2C2CZpnC9x14W5dPf0dJDVDXsaLDIxW8zJ3W529QqKl+P5VsV9PhV+xDTtwNQSdnH//uR/BeFG/0N3Q8O8AHjrM07Wr+76ZGTaYl+JKFqceUYvTuUBQbU7N0giHCAr72X7I6HWCRtgq5f7ZfwXxmT4Dwa6lcMSnL8ZXPuUYF4QIh7IO4EYHtOBhNHj85XMseuNC7gaGfwjjMx+L32J/LUgkUW9+74pikJVm7MiKM0TC2lM8hyElf4pCfcr9OkJ4Wnra3SC5+Zi00UBhn88pOXSiWTVNcNSweA5Dap9ePuV2XSEAkjWobnht8C/RfWnTVkAFyP4knWRmEOrWVZqdoC4/Cq3OQrJn3K4zDE9UQl7ceP73B82xDFTghtClRKnrJfEjcUEXGPIgK3whlw6I0Kb5BfvfwzUdMLC4Fw+V6jCT0bS2S8S5Hvlvfmcim13WRkd6E+A6B8aQbSd3ex5cwcCDuZ+2GxRFjx5x6RTmiRoEhC7j5qNOGBLg8MA7e8ZEUM2M8WP1aq0YWyyS2FdcruzTElfa8lkbKjEfZ3HXjPzygIbITEDU8vTEsaieI1LIPS1S+fRG9Os86k3ulaf/GrSjkIlgsdpcvoDi84rj+4MXzcQUUuY1X1AS8Ck3E+eRBaSG0BuCCKEabc/Esm0gcplhwu5D3mdLfz58uunz65gJqTPI2LkPVC0ocBWWPHm8ci4f0QLb8HcirBopuegq4QSEXGIcZwdUDfSQ8i9lvthj9K0VTUpOQth3HkNNdMt9Xx7RaKDwzgs5K2U/vkxdsUYs8AD0/MRvv5kloVBukw9nl19vR4WOimZh1ahMlpkcBoMN/n6KTmoD+oYSn0g8OdIEqyEiLGFnZoL04+eqic8xG9jEjU+8tYUVSaNl0nI4fpVmSA1bcMAWOuvmmMxUqfTnizJU5jGDr53GAu/sOsauQnuWEVQQ8kKSEg5GZuy6lj14m3HDM2LWP8dMCCF92at7ZMM3md9aM8JTe6fi60yXnBnhLrBZdyBlz6EUDa/0wUtBEbx6fGq2Byq1DGuSzBs4eoU27Gy15nZALZgVGbunVXVPuI5NybIzY1bc39CWCTpWMxabbgcKqEqoDST8j0WqZvgjBVSECoECif8xX7BWJlQOI5kQfVPa5HE00h3gr2LzqJcx/JUwb9I2V3ilgWxvmZhRqbOpDBNiMrHlLVmf+G2hBuOKrjtsjE1MfnQGmmo7I4nzCttJB1QH8zbDFtJW6ME58cx7id8c7TDlx4T6pGpAL8zl34Bi9IKH8CzI8qQP+Oe1kvVJEz0CASh3VL9kFqEwBjR1pB3f4RKBoO/oF0ik+aEmKHJPOBKLhoJWlQrys96YnQEj87uDHQtRHosc2Qxp9QXzBy56IB4uOKVrQvgFX5pxW7mGM3iipFGfHqnU+58lLH8cFtpzEwTSvxjIhkvoM89DyqCAeNYRUR/sScxZM1fi1XbaFycjLDGW2iGmF4AECYUU4PHUrmPUgByJtAENtQyqUEN+n6JmOJl/iQbggfht1EKkfLYhV9iyNudrDYVlzRwVIcwUzHU00W2JEFYHKq0GlCEePmWhAIXZV5jRicZQyW9e3BLLXqwQTkNWCQk9QwexUJpqo0+ul4MVhbNkyhByJxD0Jg0k+lIRDeFak6HGfkkZ81YG9T3otZIRtQmzqIlHi7XBdAZG44ZwfEkZMsMSnhAKO/WXmWS+4dhopTUXanwI1yJqXCzBto0OrNZEozmTeOuSZPqEUyRwInH4TLBHLCdJYShvz50GvQJhz5BniHNlYINnyV+rviivagkiBMitJhXBdPB1TBoX/wfivMfxfUwYwnhIwlV0wCGVNhfk1RWLWbxVRMUXZiD4/YYrpklvB6YhJjktZ0wmmgAkl5ZISEtpjcSC2nTFCwskMqM35QKAHZ0E9w4vp8/+NgpKqnE8W9QSyRABffAxLUMmaVIHBbYDJaqjWsoQUjAKUVNa3aJpc5k1ow9jw64OCUhVxeI3Ij4kIExNGf9MTuThvtEQKSWR08EBHtTuSCKBAOhtVo/nxW5Rq80rYYZt/zDTc/YaYma4BBqnxDkcWQy8GJKiBntLKpjEPFWCEG9R1NTEWBWDE9RoQgKN5zG0nRSArduPWNUkYx7K5LehGUk24VfTkRjLzdizq/g93mm7MhhYS5iefLHMEAt8qICaT0P2Gg2WkD/olJbMwST03RlDCMmWxCfAUZ6CxUKlXquHIWkgALLMmR4xV01ndix4Fhj8Ap36UEnLn0YK1GWT22BrSEIACzLBTSM9OtUmcCCFTeWEPuOQh9wvA4uSa2JTyRTHUJZAY4PGRfCSH2vsQohBx3IbuMyoUL3IGyXABGxmqkf1gBST1PcmHANeKQNO8C1ExaAxHr/onjGZPiJ8S63QxoC7FnAsbWqH0BZDpfNOrzPlxm5AVPJp88SdAOQRRYHGwl6xYBXCrwptALKAyhxIBTMkGRqSFi0NaMEy1Q2TvDETvFVUs8tpAt8Ju5LHlE+LyEkuvygweTWoK+u0mOPxMBl9iO6Bm1xUqWcNgOSlAl/NAPpOiO5bjWWgwC95kECOlZohDiUHeUMJ1ZJLida21mBXM4T1WuRp3aXcUo0czRFY/elg+IFmI/ocxPEzry5HiHj9KbQCcvguud7+xDnwAaQNeTQFNYZRpVx9ERDXUNJIPRBMLwEQeQT/H/GAaqZQ983SDCE/LlHrFG3GFwXUFAINY2mjT9gA9zVBK1SbXhieg/Ziwdy9A1+CgUODgxmVe3dRJOfhE2HakWek5rIe6ktfaBjIBJLy4ThfEHgCkGADZNxhRnoFZwLpmesnYkl9poXaJtvtWcMPxkXIWJj3d6gGJDiIhSvlFlqB/JNQgeaRhAcRVYuBbOrmrSRPLlB4ObVPn/JFxuV8IuJ8pN0UTT2ARpZrknYokPSSGQg4jcshyQlQqjJuni1ClP1Q4AcvNYW8ZAitRRwEOx9oqVA/jMK3AeU9FxJ3gxZVfG+Ctb5hO93fXyXSCggVDrxCRxmyaD43iF+YENl+IwkXEPKtoS0tgYdYDZbEoohjEIrNOyAc7NMU1Ykl98Rr7mtozlidRN9v337PIWqy0b8ME0x06cg8eGQNwkbMwW9UQDWsENqidgNJbVFoPoYNtM1IuzTV0Ug1fMubCU07BqZ7oEtMBljf4pixAbsFC4dQ0u18Y4zaliD9NUCLdBMLYyZskEao/YAGKRWtiRCfSSJ6GtCQLxK9oBUTNUd3wNOBfR2PaUeqF+RaQ0etPUTX9cAFaltR+bcwxII+OwnQ2XCNMDAKChAWlH6E9qx+gbiQk0hZKLtvJro+WR6LqJrN8jxJ0nQy2a3X5Ta2dJMbeHmz4laSztT//CQCCR/+9hppzT1dejaoc3Zh/MoVrD8xaHxGNN/v6OvlxaYQuMrM373xtCbD1so8fgah3FNj/Aehry6Gp1kZUAheedebGBtQl6LFw77G7FP4x3UkwIY8P5MYxpCpIN+0vc1M/g4dv7aAUlKGYwzlV1m3OfOPfwsOdtHz81SX64PAJ1rjjfiZ8udJ6uiT+ZSn65vqKfapFSSzvVqLV9RMt2IrsH/JrOEcvLjo3IwZ2UQfC5Nr8TfSXL1AB88YasDsRDKf5MNbQV/vYoRfUf04iYQKzzTXny41zrJtdFphzbZTVz/+TkoQrHgkRwuVbObqd+ZA2M0biyyr/rYlXwLMrad24qHefZkoyax10V2xWg3RUVgaQseti5H9+NKGbkHr9nQWIosTzotFmG4t3c8M27ZNfcc7OJOnFcCMD5yBXxpLhT1JdyvtA95PxLHYhgRrAfVR618aX6OpVjVQ6RQ52ocTy1QvlMHxmLGYPGVFJFlr1LJecMieorsmdCnUkNakI8I3IZIPv7RNDy0/002LSvNG1dJIuxbPq4AEsGrxW+qqa4ZMzgZHnYE25cbS/2xrVdMkScZ4kyRJ074cQrP6WZFv7wqE5JPy6E/XJbOi1YPwGZIu9z4o0bF56ynhTl5XFmV0a0M0TVYUx/B1y90lsyqaLxf7/epIp9oPh+NqtZ8uiuU8isIQyjRJOtmVnhtblq4HgW/CTiG2o46GGArHGF/QSj73lirW7IfXjn0JIygCpm220e6cISY6Npq4I9FV3HR6pYNoEHD2aJuBbnmTZBZGy8WmNfrpAhHrmj26IFT50a68BhHWsvVZumeILDoKkyQBjmCpaGnRc7frZBYtDu3kw65nsYywDkwmaR4Wq5OPcqwNWB0Avu8Hga7rlhVjuF65e09yolvFYr9qLr7fjlja/gky739uny8TP8uhvTfAGfLAHkyPIhUcElzeluwpOtiOnfl6vM5PqStgX4T5zo1138BW51SbtaHjx5P5kZ34oC/BFlAG73FkrXg+cDp58PvCYvtuMQSDNbnShNt3rSGgFfj/sqIagZW0EP4Uh8Vytov1TH0kGdUcq2Vx9C1gm5nap1saAEsfqm/ZP7X1GjzG9OojUMXuJsqSR5nuQug4Dxft9GeY2q4bB7aqqsNPrypfo09MlKwL9yT5qvfUSh/Iyr2f2ejpDRTk2latGp15+GbkLcmOqXtJWDvlwx5d4mNZJWvX9eCsr++2oMQrssL3q1Brmxnf7dwf72+S+wXYmACbawpiMc/3qYgi4DVKwgg3rVg94lAksa/KMk43orTmQ+IbIBKlXctk9HWfJQc0XPpOhUOpF/Pe07T4R1QEcsL3a36MDxl+boC/QklZprPaLq3myZaVI5QszmkZdXW0DDaujt1KeLpA9Gujt0rAmvgtRaBPoZkFCOMbtsv5iVkieXZruwk+hvuwCZFGpiVESvv5O1YK+k6O7+ZU+Io0zvDBeoXcWWXR/Nq+mKpFR74OZfb9EmC9/RzG7hp7YQSn82IPkDy/FsE4LJK8ukWTAE22g1KsXJeBPaJmWDH0XUXcxmG+s4wR6KNDuOQQ6zQ6HTkNsPp8ttL9ZvKKbN5RwmaK/m3SSncD/cBSExjWvTqfxMeVp3dMgJLp72wnv6rEQaqjjl0oLmiKDa0e8smm8nRbqNxNwNBLU7DT8l6sRGjvj0lAAznzmHJUrt1dU1g5icoj67zsqKY/wBDn49R+n0JjUje/kQTImUv3XzhWW+yy2dE3o5lxR4eo1J0LmVfAMNHVBnOxa+fjq00fb9CN/Ak1hJvccrpu0atxORMKNkVq+ZntOJDFWmRVVt51gwQm4W78eQI2+XljK4oAP9ZhmboBj5Ik2fa9GY9rZ66r29eoa6I8InOquZDLGaBQ68coKxlxvqEs98yfa7La5fJKAaH73jMMJ93onjKlvdHM22JlNhRFtU3f8t7zal4/+nTm5fXePVdQULe4a/buJcPxkweI+2boKV05OC/9JzTy5LG9Pp6y47Du/r4l2m+ve0GVbe16a5vCM5k5bBZR4kGaTaxXcWeLQwi648Ea7ZmtI/zw7rl0TTZc+mirxHKeuUWcE2zz5R5M9NKzfmCCCNuHG72WMV9wf3MqOYiWUb7bxrppO5clp/GdrPKNGTeSCr4RAxhft1fS0PCtXU7DhMMisX5pXEWTlZ8Rg/Wt1Eap/fK39o107o2ZD4cjAxu6jxnZSuUiPdY0SR7ZWWCt86b4Um11W32NAcnP4C28vtW+sFl68c3EV12h9J5ADZvsuJhXM0BVhdGymJ4Z7uNiVuodBrd/CrAp1dW6YbOc/PtriOFatyN2xW9buwCd2f0Ccyh/L7eu7tvO5TzIvwScEydXa5r1VtDdVNACWHpyhZpSVoKPXlWlZZK2t6LIMLbQxX1fCpNbhfV6U7x9R1sPw3IHVLnGifXScNpSgu8ovP5vgo4KNL8+hlS7kF2HkqqTYlcUB4EelzC7QIOszTr7p03RgzBvZekab1nMO96be5S5Yj3isJzExv9eNyi8WzlCxmn2U1vnDB1D1zPnT69hejISVFy1WPYH48eL7b720ghvBLRsdSFa/NkVRv8epOJG75pVTQ6v9Ae0Xh3y9HqvXAp/1oH0aIF8PF4tHzubDqpYPT6Ht0N1tcLEdgx4uT9H89KQNtc7gawzlf//qhe/CG2KrhWybNb3+/vbs/xTmF+Nstgk+HcHznp8DtW1gTTno1eQ30ByzUewub2Ot6jqcQ8x2rceN6kH+eiT9CfDbjdKKpvG6nDZVI/HsGmbmxqlvcH6LVgtQ4kG620v+pzwF7C42OrY4H8QsK8q/grQqY6MXT6Uu+sN1u9gKVQQHbdezZX2TdXfAv07OUPH3ArLIeJnzsv2OIOFzuH1NcXfxcnyLZS+0N/W+GfBl29FO/3l/pryPwtl1A+Y9OjRo0ePHj169OjRo8f/CP8Bff0iPyizT1YAAAAASUVORK5CYII=");

        allTherapists.put("Sara Thompson, COTA", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7RutFJiBAZpW9ehLHVZGI7h8F8KIYQsV9X9v6V8vZ6XRBYf-m5EnXOb-Xbbmd23LjC0U&usqp=CAU");
    }
    @GetMapping("clinic")
    public String displayClinicForm(Model model){
    model.addAttribute("educationLevel", EducationLevel.values());
    model.addAttribute("communicationLevel", CommunicationStatus.values());
    model.addAttribute("assessmentMethod", AssessmentMethod.values());
    model.addAttribute("behaviorObservations", BehaviorObservations.values());
    model.addAttribute("fineMotor", FineMotor.values());
    model.addAttribute("strengthAndRangeOfMotion", StrengthRangeOfMotion.values());
    model.addAttribute("frequencyOfOT", FrequencyOfOT.values());
    model.addAttribute("childSensoryTwoCategories", childSensoryTwoCategories);
    model.addAttribute("allTherapists",allTherapists);
        return "forms/clinic";
    }
    @PostMapping(value="clinic/{therapistName}")
    public String autoFillTherapist(Model model, @PathVariable String therapistName){
        ArrayList<Therapist> therapists=new ArrayList<>();
        Therapist kristi = new Therapist("Kristi Warren","MOT,OT/L","OT","217-891-1524","C:\\Users\\16185\\Desktop\\LC-Projects\\Java\\brains-in-motion-forms\\src\\main\\resources\\static\\images");
        Therapist newTherapist = new Therapist("New lady", "MOT,OT/L", "OT","217-555-5555","uncreated");
        if(therapistName=="kristi" ){
            therapists.add(kristi);
            model.addAttribute("therapist",therapists);
        }else {
            therapists.add(newTherapist);
            model.addAttribute("therapist",therapists);
        }
        return "clinic";
    }
}
