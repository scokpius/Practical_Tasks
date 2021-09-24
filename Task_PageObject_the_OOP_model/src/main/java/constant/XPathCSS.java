package constant;

public class XPathCSS {
    //account
    public static final String INPUT_EMAIL_CSS = "#email";
    public static final String INPUT_PASSWORD_CSS = "#password";
    public static final String BUTTON_SING_IN_XPATH = "//*[@class = \"form-row\"]/button";
    public static final String INPUT_FIRST_NAME_CSS = "#firstName";
    public static final String INPUT_LAST_NAME_CSS = "#lastName";
    public static final String BUTTON_SING_UP_XPATH = "//*[@class=\"btn btn-primary btn-block\"]";
    //HomePage
    public static final String BUTTON_CURRENCY_XPATH = "//*[@id=\"currency\"]";
    public static final String BUTTON_CURRENCY_CONTAINER_XPATH = "//*[@id=\"currency--container\"]";
    public static final String BUTTON_CURRENCY_SEARCH_ELEMENTS_XPATH = "//*[@id=\"currency--container\"]//span[contains(text(), '%s')]";
    public static final String BUTTON_CURRENCY_VERIFY_ELEMENTS_XPATH = "//*[@id=\"currency\"]/span[@class=\"btn__label\"]";
    public static final String BUTTON_ACCOUNT_XPATH = "//*[@id=\"dropdown-account-options\"]";
    public static final String BUTTON_ACCOUNT_CONTAINER_XPATH = "//*[@id=\"dropdown-account-options\"]";
    public static final String BUTTON_ACCOUNT_ELEMENTS_XPATH = "//a[text()='Sign out']";
    public static final String BUTTON_HOTELS_MENU_XPATH = "//*[@data-bdd=\"hotel\"]"; //ссылка на кнопку отеля в header
    public static final String HOME_PAGE_BUTTON_SING_UP_XPATH = "//*[@data-bdd=\"sign-up\"]";
    public static final String HOME_PAGE_BUTTON_SING_IN_XPATH = "//*[@data-bdd=\"sign-in\"]";
    public static final String HOME_PAGE_LIST_FUNCTIONS_XPATH = "//*[@class=\"farefinder-option-label hw-body-1 type-300\"]";
    public static final String HOME_PAGE_INPUT_LOCATION_XPATH = "//*[@data-bdd=\"farefinder-hotel-destination-input\"]";
    public static final String HOME_PAGE_BUTTON_CHECK_IN_XPATH = "//*[@data-bdd = \"farefinder-hotel-startdate-input\"]";
    public static final String HOME_PAGE_BUTTON_CHECK_OUT_XPATH = "//*[@data-bdd = \"farefinder-hotel-enddate-input\"]";
    public static final String HOME_PAGE_BUTTON_GUESTS_XPATH = "//*[@class=\"guest-picker\"]";
    public static final String HOME_PAGE_BUTTON_FIND_XPATH = "//*[@class=\"btn btn-primary hw-btn hw-btn-block\"]";
    public static final String HOME_PAGE_DROPDOWN_CALENDAR_XPATH = "//*[@id=\"tipContent-888\"]";
    public static final String HOME_PAGE_BUTTON_PREV_MONTH_XPATH = "//*[text()='Next month']/parent::button";
    public static final String HOME_PAGE_BUTTON_NEXT_MONTH_XPATH = "//*[text()='Previous month']/parent::button";
    public static final String HOME_PAGE_TEXT_MONTH_XPATH = "//*[@class=\"month multi simple\"]/h4/span";
    public static final String HOME_PAGE_TEXT_DAY_XPATH = "//td[contains(@aria-label, '%s')]";
    public static final String HOME_PAGE_BUTTON_ADD_MIN_XPATH = "//*[contains(@class, '%s')]//button[contains(@data-bdd, '%s')]";
    public static final String HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH = "//*[@id=\"farefinder-occupant-selector-hotel-rooms\"]";
    public static final String HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH = " //*[@id=\"farefinder-occupant-selector-hotel-adults\"]";
    public static final String HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH = "//*[@id=\"farefinder-occupant-selector-hotel-children\"]";
    public static final String HOME_PAGE_BUTTON_DONE_XPATH = "//*[@class=\"btn btn-primary btn-sm\"]";
    //HotelsPage
    public static final String HOTEL_PAGE = "//*[@class=\"WizardRegionHotwire--Background \"]";
    public static final String HOTEL_PAGE_INPUT_LOCATION_XPATH = "//*[@id=\"location-field-destination-menu\"]/div[1]/button";
    public static final String HOTEL_PAGE_BUTTON_CHECK_IN_XPATH = "//*[@id=\"startDate-btn\"]";
    public static final String HOTEL_PAGE_BUTTON_CHECK_OUT_XPATH = "//*[@id=\"endDate-btn\"]";
    public static final String HOTEL_PAGE_BUTTON_GUESTS_XPATH = "//*[@id=\"adaptive-menu\"]/div[1]/button";
    public static final String HOTEL_PAGE_BUTTON_FIND_XPATH = "//*[@data-testid=\"submit-button\"]";
    public static final String HOTEL_PAGE_DROPDOWN_CALENDAR_XPATH = "//*[@class=\"uitk-date-picker date-picker-menu\"]";
    public static final String HOTEL_PAGE_BUTTON_PREV_MONTH_XPATH = "//*[text()='Previous month']/parent::*/parent::button";
    public static final String HOTEL_PAGE_BUTTON_NEXT_MONTH_XPATH = "//*[text()='Next month']/parent::*/parent::button";
    public static final String HOTEL_PAGE_TEXT_MONTH_XPATH = "//*[@class=\"uitk-date-picker-menu-months-container\"]/div[1]/h2";
    public static final String HOTEL_PAGE_TEXT_DAY_XPATH = "//*[contains(@aria-label, 'Check-in %s')]";
    public static final String HOTEL_PAGE_CALENDAR_BUTTON_DONE_XPATH = "//*[@data-stid=\"apply-date-picker\"]";
    public static final String HOTEL_PAGE_BUTTON_ADD_MIN_XPATH = "//*[@id=\"adaptive-menu\"]//*[@class = \"uitk-flex uitk-flex-item uitk-step-input-controls\"]/button";
    public static final String HOTEL_PAGE_BUTTON_ADD_ROOM_XPATH = "//*[@data-testid=\"add-room-button\"]";
    public static final String HOTEL_PAGE_BUTTON_MIN_ROOM_XPATH = "//button[text()='Remove room']";
    public static final String HOTEL_PAGE_TEXT_AMOUNT_ROOM_XPATH = "//*[@id=\"adaptive-menu\"]//*[@class=\"uitk-heading-7\"]";
    public static final String HOTEL_PAGE_TEXT_AMOUNT_ADULT_XPATH = "//*[@id=\"adult-input-0\"]";
    public static final String HOTEL_PAGE_TEXT_AMOUNT_CHILDREN_XPATH = "//*[@id=\"child-input-0\"]";
    public static final String HOTEL_PAGE_BUTTON_DONE_XPATH = "//*[@data-testid=\"guests-done-button\"]";
    //ResultSearchPage
    public static final String RESULTS_PAGE_INPUT_LOCATION_XPATH = HOME_PAGE_INPUT_LOCATION_XPATH;
    public static final String RESULTS_PAGE_BUTTON_CHECK_IN_XPATH = HOME_PAGE_BUTTON_CHECK_IN_XPATH;
    public static final String RESULTS_PAGE_BUTTON_CHECK_OUT_XPATH = HOME_PAGE_BUTTON_CHECK_OUT_XPATH;
    public static final String RESULTS_PAGE_BUTTON_GUESTS_XPATH = HOME_PAGE_BUTTON_GUESTS_XPATH;
    public static final String RESULTS_PAGE_BUTTON_SEARCH_XPATH = HOME_PAGE_BUTTON_FIND_XPATH;
    public static final String SELECT_LIST_NAME_HOTEL_RESULT_SEARCH_XPATH = "//*[@class=\"HotelCardLayout__hotel-name\"]/span";
    public static final String SELECT_LIST_LINK_HOTEL_RESULT_SEARCH_XPATH = "//*[@class=\"result-list-components\"]//a";
    public static final String BUTTON_STANDARD_RATE_HOTELS_XPATH = "//*[@class=\"SegmentedControllerCard\"][@value=\"RETAIL\"]";
    public  static final String BUTTON_CONTINUE_XPATH = "//*[@class=\"btn btn-primary\"]";
    //HotelInformation
    public static final String IMG_LIST_PHOTOS_XPATH = "//*[@id=\"Overview\"]//*[@class=\"uitk-image-media\"]";
    public static final String FIELD_NAME_HOTEL_XPATH = "//*[@class=\"uitk-heading-3\"  and @aria-hidden=\"true\"]";
    public static final String INPUT_LOCATION_XPATH = "//*[contains(@class, 'uitk-layout-grid-item-columnspan-large-1')]//*[@class=\"uitk-heading-5\"]";
    public static final String BUTTON_ROOMS_XPATH = "//*[contains(text(), 'Rooms')]/ancestor::li";
    public static final String SELECT_LIST_NAME_ROOMS_CSS = ".uitk-spacing-padding-small-blockend-half  h3";
    public static final String LINK_MORE_DETAILS_XPATH = "//*[@data-stid=\"section-roomtype\"]/button";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_CHECK_IN_XPATH = "//*[@id=\"hotels-check-in-btn\"]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_CHECK_OUT_XPATH = "//*[@id=\"hotels-check-out-btn\"]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_GUESTS_XPATH = "//*[@id=\"travelers-field-id\"]/following-sibling::button";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_CHECK_RATES_XPATH = "//*[text()= 'Check rates']";
    public static final String HOTEL_INFORMATION_PAGE_DROPDOWN_CALENDAR_XPATH = "//*[contains(@class, 'uitk-menu-container-autoposition')]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_PREV_MONTH_XPATH = "//*[@aria-labelledby=\"prevMonth-title\"]/ancestor::button";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_NEXT_MONTH_XPATH = "//*[@aria-labelledby=\"nextMonth-title\"]/ancestor::button";
    public static final String HOTEL_INFORMATION_PAGE_TEXT_MONTH_XPATH = "//*[@class=\"month multi simple\"]/h4/span"; // проверить
    public static final String HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH = "//*[contains(@aria-label, 'Check-in %s')]";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH = "//*[@class = \"uitk-flex uitk-flex-item uitk-step-input-controls\"]/button";
    public static final String HOTEL_INFORMATION_PAGE_BUTTON_DONE_XPATH = "//*[@class=\"btn btn-primary btn-sm\"]";
    //RoomInformation
    public static final String IMG_PHOTO_XPATH = " //*[@data-testid=\"uitk-gallery-item-current-trigger\"]";
    public static final String FIELD_NAME_ROOM_XPATH = "//*[@data-stid=\"property-offers-details-dialog-header\"]/h3";
    public static final String SPAN_AREA_XPATH = "//*[@class=\"all-t-padding-half\"][1]]/span";
    public static final String SPAN_SLEEPERS_XPATH = "//*[@class=\"all-t-padding-half\"][2]/span";
    public static final String SPAN_BEDS_XPATH = "//*[@class=\"all-t-padding-half\"][3]/span";
    public static final String SPAN_PRICE_PER_NIGHT_XPATH = "//*[@class=\"uitk-price-lockup right-align\"]//*[@class=\"uitk-lockup-price\"]";
    public static final String DROPDOWN_PRICE_XPATH = "//*[@class=\"uitk-menu uitk-menu-mounted\"]/button[contains(@aria-expanded, 'true')] ";
    public static final String SPAN_PRICE_ALL_TIME_XPATH = "//*[@class=\"uitk-type-300 uitk-type-regular uitk-text-emphasis-theme\"]";
}
