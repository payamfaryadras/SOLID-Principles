package com.payam.learn.solid.srp

interface IEmailSender {

    fun send(employee: Employee,content: IEmailContent):Boolean
}