# Attendance module scenarios covered from excel sheet row no 6-10.

from behave import *
from selenium import webdriver

@given('User/Staff is on Manage Attendance page')
def step_impl(context):
    context. driver = webdriver.Chrome("null")


@when('User/Staff Clicks on Edit Button')
def step_impl(context):
    context.driver.find_element_by_xpath("//button[contains(text(),'edit button')]").click()


@then('Admin see header text as "Attendance Details"')
def step_impl(context):
    status = context.driver.find_element_by_xpath("//a[contains(text(),'Attendance Details')]").is_displayed()
    assert status is True

@given('User/Staff Clicks on Edit Button')
def step_impl(context):
    context.driver.find_element_by_xpath("//button[contains(text(),'edit button')]")

@when('User/Staff clicks on Save button after changing Program Name')
def step_impl(context):
    context.driver.find_element_by_xpath("//button[contains(text(),'save button')]").click()


@then('User/Staff see the success message "Updated Successfully"')
def step_impl(context):
    status = context.driver.find_element_by_xpath("//a[contains(text(),'Updated Successfully')]").is_displayed()
    assert status is True


@when('User/Staff clicks on Save button after changing User name')
def step_impl(context):
    context.driver.find_element_by_xpath("//button[contains(text(),'save button')]").click()

@when('User/Staff clicks on Save button after disabling Present details')
def step_impl(context):
    context.driver.find_element_by_xpath("//input[contains(text(),'Present details')]").isDisabled()
    context.driver.find_element_by_xpath("//button[contains(text(),'save button')]").click()

@when('User/Staff clicks on Save button after enabling Absent details')
def step_impl(context):
    context.driver.find_element_by_xpath("//input[contains(text(),'Absent details')]").isEnabled()
    context.driver.find_element_by_xpath("//button[contains(text(),'save button')]").click()



