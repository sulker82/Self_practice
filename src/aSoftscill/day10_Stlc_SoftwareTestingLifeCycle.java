package aSoftscill;

public class day10_Stlc_SoftwareTestingLifeCycle {

    /*
    Agenda:

- STLC: Software Testing Life Cycle

Review Test Strategy, Test Plan, Test Case Documents

New Topic:

-Environment set up

-Test Execution

      Test pass --> Test Closure

      Test fail --> Bug Life Cycle

-Test Closure

      - RTM

      - Test Coverage
----------------------------------

Test case doc:

Pre-condition:need some requirement to perform esting on a test case

              delete / update / edit / download file-

ex: As a user, I want to delete a filr.
    AC1. user should be able to delete my files.

Pre-condition:there should be at least 2 files uploaded on the file page.


=================

1. Perform manual testing

     UI manual testing : Follow our TC + take screenshot for each step -> attach them to
     the TC

   Note: if manual testing pass, QA will perform the automation

         if manual testing fail, QA will create a bug report, then a dev fix the bug
         after the dev has fixed the bug, then the QA do one more time perform manual
         testing / re-test to make sure the bug has moved --> automation

2.Perform Automation testing

    UI automation testing --> write test script(code) java+selenium+junit+maven

-------------------------------

QA1: upload a file func

     TC steps:
      user go to the module page
      click + sign
      upload a file

      bug: cannot open the module page at 11 am --> created a bug report -->assigned
      -->wip (work in progress / fixing)

QA2: create a module func

     TC steps:
      user go to the module page
      click + sign
      enter a module name

      bug: cannot open the module page at 2pm --> created a bug report -->assigned-->
      reject --> becaouse it is duplicated

     */
}
