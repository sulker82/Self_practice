package aSoftscill;

public class day07 {

    /*
    Agenda:

    - Review the Scrum keywords with examples

    - Scrum meetings:

      - Grooming meeting
          - Story point estimation

      - Sprint Planning meeting
          - Sprint Backlog: list of US/task needs to be done in the sprint
                            USs/tasks are from the PB

          - Team capacity : total work avaliability of the dev team
                            needs to be calculated in every single sprint
                            in the Sprint planning meeting

          - Definition of Ready(DOR): condition to check each User Story to identify
          if it is ready to be selected in to the SB

=======================
User Story: simple & short req
            The PO writes the US

Acceptance Criteria: condition / standard criteria / detail info about the US ,
 that helps both Business side & tech side to define if the US is DONE
           The PO write the ac for each US

Product Backlog: list of US/task waiting to be done soon
                 The PO list the US & Prioritize the USs
                 consistently updated/replaced with the new USs

Product Increment: Completed USs/tasks at the end of each sprint

-----------------------

As a user, I want to delete a file. --> user story

1. Only admin users can delete a file.
2. Admin users can delete a file from homepage and from the File page.


------------------
In one sprint(2 weeks), a scrum team has planned to complete 10 US, but only completed 8
 of them by end of the sprint.

    Completed 8 USs are called -> Product Increment


Who decides the release due date?
- Business team member --> PM & PO , BA


=========================

Grooming meeting: 1. The PO explains the US & AC to the dev team
                  2. The PO & the Dev team Estimate work effort to the USs by following
                   the Fibonacci system 1 2 3 5 8 13 21



when we estimate time effort for a US, which time box terms we are using? hours? days?

- It depends.

- Some teams use hours. 1 point = 1 hour
                        1 point = 4 hours
                        1 point = 8 hours
                        1 point = 12 hours

- most teams use the day term.
                        1 point = 1 day

Scenario 1:

                        ex:
                        SDET 1 : 2 points == 2 days to test
                        SDET 2 : 1 point  == 1 day to test
                        SDET 3 : 13 points == 13 days to test
                               final point == 2 points to test

                         Dev 1 : 3 points == 3 days to develop the func
                         Dev 2 : 5 points == 5 days to develop the func
                         Dev 3 : 3 points == 3 days to develop the func
                         Dev 4 : 8 points == 8 days to develop the func
                                final point == 5 points

                                combine SDET's and Dve's effort time == The PO writes in the
                                Jira app 2+5 ==7--> 8

Scenario 2:

    SDET 1 : 2 points == 2 days to develop & test
    SDET 2 : 5 point  == 5 day to develop & test
    SDET 3 : 8 points == 8 days to develop & test

    Dev 1 : 3 points  == 3 days to develop & test
    Dev 2 : 5 points  == 5 days to develop & test
    Dev 3 : 13 points == 13 days to develop & test
    Dev 4 : 8 points  == 8 days to develop & test

           final point: 5 points






As a user, I want to delete a file. --> user story

1. Only admin users can delete a file.
2. Admin users can delete a file from homepage and from the File page.


SDET 1 : 2 days

SDET 2 : 1 day

SDET 3 : 5 days

=====================

Sprint planning meeting: select User story/task from PB into the SB based on the team
capacity & DOR criteria

Step 1. SM create a Sprint Backlog
          - click "Create Sprint button" in jira

Step 2. SM helps the dev team to identify & calculate the team capacity
         - SM asks a question: "Any one has any day off during this Sprint?"

            EX:calculate Team Capacity for the Sprint 4: 14/02 -- 25/02
                dev1 : 8
                dev2 : 8
                dev3 : 6
                qa1  : 8
                qa2  : 8
                total : 8+8+6+8+8 == 38 team capacity for this sprint

                this team can only complete max 38 points of US in this sprint 4


Step 3: The PO selects USs from the PB into the SB based on the team capacity

Step4 : SM starts the sprint + write the sprint goal

Step5: team lead assigns US to the dev team members

       OR

       each team member will select one US by themselves





SB = Sprint Backlog

Team capacity

DOR = Definition of Ready


==============
    SDET 1 : has 8 days to work on USs
    SDET 2 : has 8 days to work on USs
    SDET 3 : has 8 days to work on USs

    Dev 1 : has 8 days to work on USs
    Dev 2 : has 8 days to work on USs
    Dev 3 : has 8 days to work on USs
    Dev 4 : has 8 days to work on USs

      total SDET & Devs available : 8+8+8 + 8+8+8+8 == 64 total team capacity

     */
}
