package constant;

public class XPathCSS {
    //account
    public static final String INPUT_EMAIL_CSS = "#email";
    public static final String INPUT_PASSWORD_CSS = "#password";
    public static final String BUTTON_SING_IN_XPATH = "//*[@class = \"form-row\"]/button";
    public static final String INPUT_FIRST_NAME_CSS = "#firstName";
    public static final String INPUT_LAST_NAME_CSS = "#lastName";
    public static final String BUTTON_SING_UP_XPATH = "//*[@class=\"btn btn-primary btn-block\"]";
    //RoomInformation
    public static final String IMG_PHOTO_XPATH = " //*[@data-testid=\"uitk-gallery-item-current-trigger\"]";
    public static final String FIELD_NAME_ROOM_XPATH = "//*[@data-stid=\"property-offers-details-dialog-header\"]/h3";
    public static final String SPAN_AREA_XPATH = "//*[@class=\"all-t-padding-half\"][1]]/span";
    public static final String SPAN_SLEEPERS_XPATH = "//*[@class=\"all-t-padding-half\"][2]/span";
    public static final String SPAN_BEDS_XPATH = "//*[@class=\"all-t-padding-half\"][3]/span";
    public static final String SPAN_PRICE_PER_NIGHT_XPATH = "//*[@class=\"uitk-price-lockup right-align\"]//*[@class=\"uitk-lockup-price\"]";
    public static final String DROPDOWN_PRICE_XPATH = "//*[@class=\"uitk-menu uitk-menu-mounted\"]/button[contains(@aria-expanded, 'true')] ";
    public static final String SPAN_PRICE_ALL_TIME_XPATH = "//*[@class=\"uitk-type-300 uitk-type-regular uitk-text-emphasis-theme\"]"; // 6 элемент
    //ResultSearch
    public static final String SELECT_LIST_RESULT_SEARCH_XPATH = "//*[@class=\"result-list-components\"]";
    public static final String BUTTON_STANDARD_RATE_HOTELS_XPATH = "//*[@class=\"SegmentedControllerCard\"][@value=\"RETAIL\"]";
    public  static final String BUTTON_CONTINUE_XPATH = "//*[@class=\"btn btn-primary\"]";
    //HotelInformation
    public static final String IMG_LIST_PHOTOS_XPATH = "//*[@id=\"Overview\"]//figure[contains(@class, 'uitk-layout-grid-item')]";
    public static final String FIELD_NAME_HOTEL_XPATH = "//*[@class=\"uitk-heading-3\"]";
    public static final String INPUT_LOCATION_XPATH = " //*[@itemprop=\"address\"]";
    public static final String SELECT_LIST_ROOMS_XPATH = "//div[contains(@data-stid, 'property-offer')]";
    public static final String LINK_MORE_DETAILS_XPATH = "//*[@data-stid=\"section-roomtype\"]/button";

    public static final String BUTTON_CURRENCY_XPATH = "//*[@id=\"currency\"]";
    public static final String BUTTON_CURRENCY_CONTAINER_XPATH = "//*[@id=\"currency--container\"]";
    public static final String BUTTON_CURRENCY_ELEMENTS_XPATH = "//*[@id=\"currency--container\"]/li[4]";
    public static final String BUTTON_ACCOUNT_XPATH = "//*[@id=\"dropdown-account-options\"]";
    public static final String BUTTON_ACCOUNT_CONTAINER_XPATH = "//*[@id=\"dropdown-account-options\"]";
    public static final String BUTTON_ACCOUNT_ELEMENTS_XPATH = "//*[@id=\"dropdown-account-options--container\"]/li[5]";
    public static final String LINK_LIST_MENU_XPATH = "//*[@id=\"root\"]/div[1]/nav/div/ul/li/a";
    //HomePage
    public static final String HOME_PAGE_BUTTON_SING_UP_XPATH = " //*[@data-bdd=\"sign-in\"]"; // buttonSignUp локатор
    public static final String HOME_PAGE_BUTTON_SING_IN_XPATH = "#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-default.sign-in.btn-xs"; // buttonSignIn локатор
    public static final String HOME_PAGE_LIST_FUNCTIONS_XPATH = "//*[@class=\"farefinder-option-label hw-body-1 type-300\"]"; // "//*[@class=\"farefinder-options\"]/div";
    public static final String HOME_PAGE_INPUT_LOCATION_XPATH = " //*[@data-bdd=\"farefinder-hotel-destination-input\"]";
    public static final String HOME_PAGE_BUTTON_CHECK_IN_XPATH = "//*[@data-bdd = \"farefinder-hotel-startdate-input\"]";
    public static final String HOME_PAGE_BUTTON_CHECK_OUT_XPATH = "//*[@data-bdd = \"farefinder-hotel-enddate-input\"]";
    public static final String HOME_PAGE_BUTTON_GUESTS_XPATH = " //*[@class = \"hw-form-group form-group floating-label not-empty has-icon is-readonly\"]";
    public static final String HOME_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH = "//*[@class=\"guest-fields\"]";
    public static final String HOME_PAGE_BUTTON_FIND_XPATH = "///*[@class=\"btn btn-primary hw-btn hw-btn-block\"]";
    public static final String HOME_PAGE_DROPDOWN_CALENDAR_XPATH = "//*[@id=\"tipContent-888\"]";
    public static final String HOME_PAGE_BUTTON_PREV_MONTH_XPATH = "//*[@role=\"application\"]/div[1]/button";
    public static final String HOME_PAGE_BUTTON_NEXT_MONTH_XPATH = "//*[@role=\"application\"]/div[3]/button";
    public static final String HOME_PAGE_TEXT_MONTH_XPATH = "//*[@class=\"month multi simple\"]/h4/span";
    public static final String HOME_PAGE_TEXT_DAY_XPATH = "//td[contains(@aria-label, '%s %s, %s')]";
    public static final String HOME_PAGE_DROPDOWN_TEXT_AMOUNT_XPATH = HOME_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH + "/div//input";
    public static final String HOME_PAGE_BUTTON_ADD_MIN_XPATH = "//*[@class=\"guest-fields\"]/div[%d]//button[%d]";
    public static final String HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH = "//*[@id=\"farefinder-occupant-selector-hotel-rooms\"]";
    public static final String HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH = " //*[@id=\"farefinder-occupant-selector-hotel-adults\"]";
    public static final String HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH = "//*[@id=\"farefinder-occupant-selector-hotel-children\"]";
    public static final String HOME_PAGE_BUTTON_DONE_XPATH = "//*[@class=\"btn btn-primary btn-sm\"]";
    //HotelPage
    public static final String HOTEL_PAGE = "\"//*[@class=\\\"WizardRegionHotwire--Background \\\"]\"";
    public static final String HOTEL_PAGE_INPUT_LOCATION_XPATH = "//*[@id=\"location-field-destination-menu\"]/div[1]/button";
    public static final String HOTEL_PAGE_BUTTON_CHECK_IN_XPATH = "//*[@id=\"startDate-btn\"]";
    public static final String HOTEL_PAGE_BUTTON_CHECK_OUT_XPATH = "//*[@id=\"endDate-btn\"]";
    public static final String HOTEL_PAGE_BUTTON_GUESTS_XPATH = "//*[@id=\"adaptive-menu\"]/div[1]/button";
    public static final String HOTEL_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH = "//*[@id=\"adaptive-menu\"]/div[2]";
    public static final String HOTEL_PAGE_BUTTON_FIND_XPATH = "//*[@data-testid=\"submit-button\"]";
    public static final String HOTEL_PAGE_DROPDOWN_CALENDAR_XPATH = "//*[@class=\"uitk-date-picker date-picker-menu\"]";
    public static final String HOTEL_PAGE_BUTTON_PREV_MONTH_XPATH = "//*[@class=\"uitk-calendar\"]/div/button[1]";
    public static final String HOTEL_PAGE_BUTTON_NEXT_MONTH_XPATH = "//*[@class=\"uitk-calendar\"]/div/button[2]";
    public static final String HOTEL_PAGE_TEXT_MONTH_XPATH = "//*[@class=\"uitk-date-picker-menu-months-container\"]/div[1]/h2";
    public static final String HOTEL_PAGE_TEXT_DAY_XPATH = "//button[contains(@aria-label, '%s %s, %s')] ";
    public static final String HOTEL_PAGE_CALENDAR_BUTTON_DONE_XPATH = "//*[@data-stid=\"apply-date-picker\"]";
    public static final String HOTEL_PAGE_DROPDOWN_TEXT_AMOUNT_XPATH = HOTEL_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH + "/div//input";
    public static final String HOTEL_PAGE_BUTTON_ADD_MIN_XPATH = "//*[@id=\"adaptive-menu\"]/div[2]/div/section/div[2]/button";//проверить
    public static final String HOTEL_PAGE_BUTTON_DONE_XPATH = "//*[@data-testid=\"guests-done-button\"]";
    //HotelInformationPage
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_CHECK_IN_XPATH = "//*[@data-bdd = \"farefinder-hotel-startdate-input\"]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_CHECK_OUT_XPATH = "//*[@id=\"endDate-btn\"]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_GUESTS_XPATH = "//*[@id=\"adaptive-menu\"]/div[1]/button";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH = "//*[@id=\"adaptive-menu\"]/div[2]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_FIND_XPATH = "//*[@data-testid=\"submit-button\"]";
    public static final String HOTEL_INFORMATION_PAGE_DROPDOWN_CALENDAR_XPATH = "//*[@class=\"uitk-date-picker date-picker-menu\"]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_PREV_MONTH_XPATH = "//*[@class=\"uitk-calendar\"]/div/button[1]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_NEXT_MONTH_XPATH = "//*[@class=\"uitk-calendar\"]/div/button[2]";
    public static final String HOTEL_INFORMATION_PAGE_TEXT_MONTH_XPATH = "//*[@class=\"month multi simple\"]/h4/span";
    public static final String HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH = "//td[contains(@aria-label, '%s %s, %s')]";
    public static final String HOTEL_INFORMATION_PAGE_DROPDOWN_TEXT_AMOUNT_XPATH = HOTEL_INFORMATION_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH + "/div//input";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH = "//*[@class=\"guest-fields\"]/div[%d]//button[%d]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_DONE_XPATH = "//*[@class=\"btn btn-primary btn-sm\"]";

}
