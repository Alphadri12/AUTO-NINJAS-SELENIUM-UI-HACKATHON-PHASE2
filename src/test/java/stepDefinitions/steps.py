from behave import *
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver=webdriver.Chrome()

@given(u'Admin is on Manage Attendance page')
def step_impl(context):
    browser = webdriver.Chrome()
    url = 'manage-attendance'
    browser.get(url)


@when(u'Admin Clicks on Delete Button')
def step_impl(context):
    driver.find_element_by_css_selector('.delete-button').click()


@then(u'Admin see Error Message "Admin Has View Only Permission"')
def step_impl(context):
    obj = driver.switch_to.alert
    msg = obj.text
    assert msg == "Admin Has View Only Permission"

@given(u'Admin/User/Staff is on Manage Attendance page')
def step_impl(context):
    browser = webdriver.Chrome()
    url = 'manage-attendance'
    browser.get(url)


@when(u'Admin/User/Staff Clicks on Checkbox')
def step_impl(context):
    browser = webdriver.Chrome()
    browser.find_element_by_xpath(
        ".//*[contains(text(), 'Program Name')]"
    ).click()


@then(u'Admin/User/Staff  see list of Users in that Program')
def step_impl(context):
    html_list = driver.find_element_by_id("users")
    users = html_list.find_elements_by_tag_name("li")
    for user in users:
         print
         user


@when(u'Admin/User/Staff  Clicks on Present')
def step_impl(context):
    browser = webdriver.Chrome()
    browser.find_element_by_xpath(
        ".//*[contains(text(), 'User present')]"
    ).click()


@then(u'Admin/User/Staff  see the list of  "User Name" who are Present')
def step_impl(context):
    html_list = driver.find_element_by_id("users")
    users = html_list.find_elements_by_tag_name("li::present")
    for user in users:
        print
        user


@when(u'Admin/User/Staff  Clicks on Absent')
def step_impl(context):
    browser = webdriver.Chrome()
    browser.find_element_by_xpath(
        ".//*[contains(text(), 'User absent')]"
    ).click()


@then(u'Admin/User/Staff  see the list of  "User Name" who are Absent')
def step_impl(context):
    html_list = driver.find_element_by_id("users")
    users = html_list.find_elements_by_tag_name("li::absent")
    for user in users:
        print
        user
