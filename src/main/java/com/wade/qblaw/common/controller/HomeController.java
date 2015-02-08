package com.wade.qblaw.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        LOGGER.info("Rendering homepage.");
        return "index";
    }

    @RequestMapping(value = "/base/about-us", method = RequestMethod.GET)
    public String aboutus1() {
        LOGGER.info("Rendering about-us page.");
        return "base/about-us/index";
    }

    @RequestMapping(value = "/base/2011", method = RequestMethod.GET)
    public String aboutus2() {
        LOGGER.info("Rendering about-us page.");
        return "base/2011/index";
    }

    @RequestMapping(value = "/base/2012", method = RequestMethod.GET)
    public String aboutus3() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/index";
    }

    @RequestMapping(value = "/base/2013", method = RequestMethod.GET)
    public String aboutus4() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/index";
    }

    @RequestMapping(value = "/base/2013-fiscal-cliff-deal", method = RequestMethod.GET)
    public String aboutus5() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013-fiscal-cliff-deal/index";
    }

    @RequestMapping(value = "/base/2014", method = RequestMethod.GET)
    public String aboutus6() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/index";
    }

    @RequestMapping(value = "/base/2015", method = RequestMethod.GET)
    public String aboutus7() {
        LOGGER.info("Rendering about-us page.");
        return "base/2015/index";
    }

    @RequestMapping(value = "/base/areas-of-practice", method = RequestMethod.GET)
    public String aboutus8() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/index";
    }

    @RequestMapping(value = "/base/attorneys", method = RequestMethod.GET)
    public String aboutus9() {
        LOGGER.info("Rendering about-us page.");
        return "/base/attorneys/index";
    }

    @RequestMapping(value = "/base/blog", method = RequestMethod.GET)
    public String aboutus10() {
        LOGGER.info("Rendering about-us page.");
        return "base/blog/index";
    }

    @RequestMapping(value = "/base/contact", method = RequestMethod.GET)
    public String aboutus11() {
        LOGGER.info("Rendering about-us page.");
        return "base/contact/index";
    }

    @RequestMapping(value = "/base/events-resources", method = RequestMethod.GET)
    public String aboutus12() {
        LOGGER.info("Rendering about-us page.");
        return "base/events-resources/index";
    }

    @RequestMapping(value = "/base/legal-disclaimer-privacy-policy", method = RequestMethod.GET)
    public String aboutus13() {
        LOGGER.info("Rendering about-us page.");
        return "base/legal-disclaimer-privacy-policy/index";
    }

    @RequestMapping(value = "/base/2011/11", method = RequestMethod.GET)
    public String aboutus14() {
        LOGGER.info("Rendering about-us page.");
        return "base/2011/11/index";
    }

    @RequestMapping(value = "/base/2011/12", method = RequestMethod.GET)
    public String aboutus15() {
        LOGGER.info("Rendering about-us page.");
        return "base/2011/12/index";
    }

    @RequestMapping(value = "/base/2012/02", method = RequestMethod.GET)
    public String aboutus16() {
        LOGGER.info("Rendering about-us page.");
        return "base/2011/02/index";
    }

    @RequestMapping(value = "/base/2012/03", method = RequestMethod.GET)
    public String aboutus17() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/03/index";
    }

    @RequestMapping(value = "/base/2012/04", method = RequestMethod.GET)
    public String aboutus18() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/04/index";
    }

    @RequestMapping(value = "/base/2012/05", method = RequestMethod.GET)
    public String aboutus19() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/05/index";
    }

    @RequestMapping(value = "/base/2012/06", method = RequestMethod.GET)
    public String aboutus20() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/06/index";
    }

    @RequestMapping(value = "/base/2012/07", method = RequestMethod.GET)
    public String aboutus21() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/07/index";
    }

    @RequestMapping(value = "/base/2012/08", method = RequestMethod.GET)
    public String aboutus22() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/08/index";
    }

    @RequestMapping(value = "/base/2012/09", method = RequestMethod.GET)
    public String aboutus23() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/09/index";
    }

    @RequestMapping(value = "/base/2012/10", method = RequestMethod.GET)
    public String aboutus24() {
        LOGGER.info("Rendering about-us page.");
        return "base/2012/10/index";
    }

    @RequestMapping(value = "/base/2013/01", method = RequestMethod.GET)
    public String aboutus25() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/01/index";
    }

    @RequestMapping(value = "/base/2013/02", method = RequestMethod.GET)
    public String aboutus26() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/02/index";
    }

    @RequestMapping(value = "/base/2013/04", method = RequestMethod.GET)
    public String aboutus27() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/04/index";
    }

    @RequestMapping(value = "/base/2013/05", method = RequestMethod.GET)
    public String aboutus28() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/05/index";
    }

    @RequestMapping(value = "/base/2013/06", method = RequestMethod.GET)
    public String aboutus29() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/06/index";
    }

    @RequestMapping(value = "/base/2013/07", method = RequestMethod.GET)
    public String aboutus30() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/07/index";
    }

    @RequestMapping(value = "/base/2013/09", method = RequestMethod.GET)
    public String aboutus31() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/09/index";
    }

    @RequestMapping(value = "/base/2013/10", method = RequestMethod.GET)
    public String aboutus32() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013/10/index";
    }

    @RequestMapping(value = "/base/2013-fiscal-cliff-deal/feed", method = RequestMethod.GET)
    public String aboutus33() {
        LOGGER.info("Rendering about-us page.");
        return "base/2013-fiscal-cliff-deal/feed/index";
    }

    @RequestMapping(value = "/base/2014/02", method = RequestMethod.GET)
    public String aboutus34() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/02/index";
    }

    @RequestMapping(value = "/base/2014/03", method = RequestMethod.GET)
    public String aboutus35() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/03/index";
    }

    @RequestMapping(value = "/base/2014/04", method = RequestMethod.GET)
    public String aboutus36() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/04/index";
    }

    @RequestMapping(value = "/base/2014/05", method = RequestMethod.GET)
    public String aboutus37() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/05/index";
    }

    @RequestMapping(value = "/base/2014/06", method = RequestMethod.GET)
    public String aboutus38() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/06/index";
    }

    @RequestMapping(value = "/base/2014/07", method = RequestMethod.GET)
    public String aboutus39() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/07/index";
    }

    @RequestMapping(value = "/base/2014/08", method = RequestMethod.GET)
    public String aboutus40() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/08/index";
    }

    @RequestMapping(value = "/base/2014/09", method = RequestMethod.GET)
    public String aboutus41() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/09/index";
    }

    @RequestMapping(value = "/base/2014/10", method = RequestMethod.GET)
    public String aboutus42() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/10/index";
    }

    @RequestMapping(value = "/base/2014/11", method = RequestMethod.GET)
    public String aboutus43() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/11/index";
    }

    @RequestMapping(value = "/base/2014/12", method = RequestMethod.GET)
    public String aboutus44() {
        LOGGER.info("Rendering about-us page.");
        return "base/2014/12/index";
    }

    @RequestMapping(value = "/base/2015/01", method = RequestMethod.GET)
    public String aboutus45() {
        LOGGER.info("Rendering about-us page.");
        return "base/2015/01/index";
    }

    @RequestMapping(value = "/base/about-us/feed", method = RequestMethod.GET)
    public String aboutus46() {
        LOGGER.info("Rendering about-us page.");
        return "base/about-us/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/asset-protection-planning", method = RequestMethod.GET)
    public String aboutus47() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/asset-protection-planning/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/business-succession-planning", method = RequestMethod.GET)
    public String aboutus48() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/business-succession-planning/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/civil-litigation", method = RequestMethod.GET)
    public String aboutus49() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/civil-litigation/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/corporate-business-law", method = RequestMethod.GET)
    public String aboutus50() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/corporate-business-law/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/elder-law", method = RequestMethod.GET)
    public String aboutus51() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/elder-law/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/feed", method = RequestMethod.GET)
    public String aboutus52() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/guardianships", method = RequestMethod.GET)
    public String aboutus53() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/guardianships/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/long-term-care-planning", method = RequestMethod.GET)
    public String aboutus54() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/long-term-care-planning/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/medicaid-planning", method = RequestMethod.GET)
    public String aboutus55() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/medicaid-planning/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/personal-injury", method = RequestMethod.GET)
    public String aboutus56() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/personal-injury/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/probate", method = RequestMethod.GET)
    public String aboutus57() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/probate/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/real-estate-law", method = RequestMethod.GET)
    public String aboutus58() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/real-estate-law/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/social-security-and-disability-appeals", method = RequestMethod.GET)
    public String aboutus59() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/social-security-and-disability-appeals/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/special-needs-planning", method = RequestMethod.GET)
    public String aboutus60() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/special-needs-planning/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/traffic-drivers-license-violations", method = RequestMethod.GET)
    public String aboutus61() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/traffic-drivers-license-violations/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/trust-administration", method = RequestMethod.GET)
    public String aboutus62() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/trust-administration/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/va-benefits", method = RequestMethod.GET)
    public String aboutus63() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/va-benefits/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/wills-trusts-estate-planning", method = RequestMethod.GET)
    public String aboutus64() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/wills-trusts-estate-planning/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/workers-compensation", method = RequestMethod.GET)
    public String aboutus65() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/workers-compensation/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/asset-protection-planning/feed", method = RequestMethod.GET)
    public String aboutus66() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/asset-protection-planning/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/business-succession-planning/feed", method = RequestMethod.GET)
    public String aboutus67() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/business-succession-planning/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/civil-litigation/feed", method = RequestMethod.GET)
    public String aboutus68() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/civil-litigation/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/corporate-business-law/feed", method = RequestMethod.GET)
    public String aboutus69() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/corporate-business-law/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/elder-law/feed", method = RequestMethod.GET)
    public String aboutus70() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/elder-law/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/guardianships/feed", method = RequestMethod.GET)
    public String aboutus71() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/guardianships/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/long-term-care-planning/feed", method = RequestMethod.GET)
    public String aboutus72() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/long-term-care-planning/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/medicaid-planning/feed", method = RequestMethod.GET)
    public String aboutus73() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/medicaid-planning/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/personal-injury/feed", method = RequestMethod.GET)
    public String aboutus74() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/personal-injury/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/probate/feed", method = RequestMethod.GET)
    public String aboutus75() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/probate/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/real-estate-law/feed", method = RequestMethod.GET)
    public String aboutus76() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/real-estate-law/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/social-security-and-disability-appeals/feed", method = RequestMethod.GET)
    public String aboutus77() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/social-security-and-disability-appeals/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/special-needs-planning/feed", method = RequestMethod.GET)
    public String aboutus78() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/special-needs-planning/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/traffic-drivers-license-violations/feed", method = RequestMethod.GET)
    public String aboutus79() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/traffic-drivers-license-violations/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/trust-administration/feed", method = RequestMethod.GET)
    public String aboutus80() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/trust-administration/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/va-benefits/feed", method = RequestMethod.GET)
    public String aboutus81() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/va-benefits/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/wills-trusts-estate-planning/feed", method = RequestMethod.GET)
    public String aboutus82() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/wills-trusts-estate-planning/feed/index";
    }

    @RequestMapping(value = "/base/areas-of-practice/workers-compensation/feed", method = RequestMethod.GET)
    public String aboutus83() {
        LOGGER.info("Rendering about-us page.");
        return "base/areas-of-practice/workers-compensation/feed/index";
    }

    @RequestMapping(value = "/base/attorneys/brian-g-quinn", method = RequestMethod.GET)
    public String aboutus84() {
        LOGGER.info("Rendering about-us page.");
        return "base/attorneys/brian-g-quinn/index";
    }

    @RequestMapping(value = "/base/attorneys/feed", method = RequestMethod.GET)
    public String aboutus85() {
        LOGGER.info("Rendering about-us page.");
        return "base/attorneys/feed/index";
    }

    @RequestMapping(value = "/base/attorneys/gregory-f-quinn", method = RequestMethod.GET)
    public String aboutus86() {
        LOGGER.info("Rendering about-us page.");
        return "base/attorneys/gregory-f-quinn/index";
    }

    @RequestMapping(value = "/base/attorneys/stephen-c-banton", method = RequestMethod.GET)
    public String aboutus87() {
        LOGGER.info("Rendering about-us page.");
        return "base/attorneys/stephen-c-banton/index";
    }

    @RequestMapping(value = "/base/attorneys/brian-g-quinn/feed", method = RequestMethod.GET)
    public String aboutus88() {
        LOGGER.info("Rendering about-us page.");
        return "base/attorneys/brian-g-quinn/feed/index";
    }

    @RequestMapping(value = "/base/attorneys/gregory-f-quinn/feed", method = RequestMethod.GET)
    public String aboutus89() {
        LOGGER.info("Rendering about-us page.");
        return "base/attorneys/gregory-f-quinn/feed/index";
    }

    @RequestMapping(value = "/base/attorneys/stephen-c-banton/feed", method = RequestMethod.GET)
    public String aboutus90() {
        LOGGER.info("Rendering about-us page.");
        return "base/attorneys/stephen-c-banton/feed/index";
    }

    @RequestMapping(value = "/base/blog/page", method = RequestMethod.GET)
    public String aboutus91() {
        LOGGER.info("Rendering about-us page.");
        return "base/blog/page/index";
    }

    @RequestMapping(value = "/base/blog/page/2", method = RequestMethod.GET)
    public String aboutus92() {
        LOGGER.info("Rendering about-us page.");
        return "base/blog/page/2/index";
    }

    @RequestMapping(value = "/base/blog/page/3", method = RequestMethod.GET)
    public String aboutus93() {
        LOGGER.info("Rendering about-us page.");
        return "base/blog/page/3/index";
    }

    @RequestMapping(value = "/base/blog/page/4", method = RequestMethod.GET)
    public String aboutus94() {
        LOGGER.info("Rendering about-us page.");
        return "base/blog/page/4/index";
    }

    @RequestMapping(value = "/base/blog/page/5", method = RequestMethod.GET)
    public String aboutus95() {
        LOGGER.info("Rendering about-us page.");
        return "base/blog/page/5/index";
    }

    @RequestMapping(value = "/base/blog/page/6", method = RequestMethod.GET)
    public String aboutus96() {
        LOGGER.info("Rendering about-us page.");
        return "base/blog/page/6/index";
    }

    @RequestMapping(value = "/base/contact/feed", method = RequestMethod.GET)
    public String aboutus97() {
        LOGGER.info("Rendering about-us page.");
        return "base/contact/feed/index";
    }

    @RequestMapping(value = "/base/contact/newsletter", method = RequestMethod.GET)
    public String aboutus98() {
        LOGGER.info("Rendering about-us page.");
        return "base/contact/newsletter/index";
    }

    @RequestMapping(value = "/base/contact/review-us", method = RequestMethod.GET)
    public String aboutus99() {
        LOGGER.info("Rendering about-us page.");
        return "base/contact/review-us/index";
    }

    @RequestMapping(value = "/base/contact/newsletter/feed", method = RequestMethod.GET)
    public String aboutus100() {
        LOGGER.info("Rendering about-us page.");
        return "base/contact/newsletter/feed/index";
    }

    @RequestMapping(value = "/base/contact/review-us/feed", method = RequestMethod.GET)
    public String aboutus101() {
        LOGGER.info("Rendering about-us page.");
        return "base/contact/review-us/feed/index";
    }

    @RequestMapping(value = "/base/events-resources/feed", method = RequestMethod.GET)
    public String aboutus102() {
        LOGGER.info("Rendering about-us page.");
        return "base/events-resources/feed/index";
    }
}
