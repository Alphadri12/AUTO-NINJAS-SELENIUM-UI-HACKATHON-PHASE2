from lib2to3.pgen2 import driver

from behave import *
from selenium import webdriver

@given(u'Admin/User/Staff Logged on to LMS Website')
def loginToLmswebsite(context):
    context.driver.get("LMS website")

@when(u'Admin/User/Staff Clicks on Attendance button')
def attendanceFunction(context):
   status= context.driver.find_element_by_xpath("//button/(contains,text(),'Attendance')").is_displayed()
   assert status is True
   driver.find_element_by_xpath("//button/(contains,text(),'Attendance')").click()

@then(u'Admin/User/Staff see header text as "Manage Attendance"')
def headerTextFunction(context):
    status = context.driver.find_element_by_xpath("//div/(contains,text(),'Manage Attendance')").is_displayed()
    assert status is True


@when(u'Admin/User/Staff is on Manage Attandance page')
def manageAttndcePage(context):
    context.driver.get("Manage Attendance Page")

@then(u'Admin/User/Staff see Footer text as "In total there are 5 entries."')
def footerTextVisibility(context):
    status = context.driver.find_element_by_xpath("//div/(contains,text(),'total 5 entries')").is_displayed()
    assert status is True


@when(u'Admin/User/Staff is on Manage Attendance page')
def manageAttndcePage(context):
    context.driver.get("Manage Attendance Page")


@then(u'Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."')
def managePageTextVisibility(context):
    status = context.driver.find_element_by_xpath("//div/(contains,text(),'5 of 5 entries')").is_displayed()
    assert status is True



@then(u'Admin/User/Staff see all paginator buttons are Disabled')
def paginatorBtnVisibility(context):
    status = context.driver.find_element_by_xpath("//li[@class='pagination-link next-link']/a[@data-aa-name='srp-next-page']").is_displayed()
    assert status is True

