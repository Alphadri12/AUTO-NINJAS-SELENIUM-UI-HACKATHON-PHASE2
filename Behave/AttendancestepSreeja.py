from behave import *


@given(u'User/Staff Clicks on Edit Button')
def editButton(context):
    context.driver.find_element_by_xpth("//div[@id='edit']").click()


@when(u'User/Staff clicks on Cancel button after entering details')
def editCancel(context):
    context.driver.find_element_by_xpath("//div[@id='cancel']").click()


@then(u'User/Staff see a Attendance Details window getting closed')
def windowClose(context):
    context.windowClose()


@given(u'Admin is on Manage Attendance page')
def adminAttendance(context):
    text = context.driver.find_element_by_xpth("//a[contains(text()='Attendance works')]").text
    assert text is True


@when(u'Admin Clicks on Edit Button')
def adminEdit(context):
    context.driver.find_element_by_xpth("//div[@id='edit']").click()


@then(u'Admin see Error Message "Admin Has View Only Permission"')
def errorMsg(context):
    text = context.driver.find_element_by_xpth("//a[contains(text()='Admin Has View Only Permission')]").text
    assert text is True


@given(u'User/Staff is on Manage Attendance page')
def userStaffAttendance(context):
    text = context.driver.find_element_by_xpth("//a[contains(text()='Attendance works')]").text
    assert text is True


@when(u'User/Staff Clicks on Delete Button')
def deleteButton(context):
    context.driver.find_element_by_xpth("//div/[@id = 'Delete']").click()


@then(u'Admin see header text as "Delete Confirm"')
def deleteConfirm(context):
    text = context.driver.find_element_by_xpth("//a[contains(text()='Delete Confirm')]").text
    assert text is True


@given(u'User/Staff Clicks on Delete Button')
def deleteButton(context):
    context.driver.find_element_by_xpth("//div/[@id = 'Delete']").click()


@when(u'User/Staff  Clicks on " Yes"  button')
def yesButton(context):
    context.driver.find_element_by_xpth("//div/[@id = 'Yes']").click()


@then(u'"User/Staff  see Success message "Program Deleted Successfully"')
def successMsg(context):
    text = context.driver.find_element_by_xpth("//a[contains(text()='Program deleted')]").text
    assert text is True


@when(u'User/Staff  Clicks on "No" button')
def noButton(context):
    context.driver.find_element_by_xpth("//div/[@id = 'No']").click()


@then(u'User/Staff can see Program Name not delete')
def programNotDeleteMethod(context):
    text = context.driver.find_element_by_xpth("//a[contains(text()='Program Name not delete')]").text
    assert text is True
