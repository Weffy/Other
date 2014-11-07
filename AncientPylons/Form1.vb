Public Class frmAncPylons
    Dim sol1, sol2, sol3, sol4 As String
    Dim given1, given2, given3, given4 As String
    Dim answer1, answer2, answer3, answer4 As String
    Private Sub frmAncPylons_Load() Handles MyBase.Load
        Dim solColors1() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        Dim solColors2() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        Dim solColors3() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        Dim solColors4() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        Dim solColors5() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        Dim solColors6() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        Dim solColors7() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        Dim solColors8() As String = {"Green", "Blue", "Red", "Yellow", "Purple", "White"}
        cbSolve1.DataSource = solColors1
        cbSolve2.DataSource = solColors2
        cbSolve3.DataSource = solColors3
        cbSolve4.DataSource = solColors4
        cbGiven1.DataSource = solColors5
        cbGiven2.DataSource = solColors6
        cbGiven3.DataSource = solColors7
        cbGiven4.DataSource = solColors8
    End Sub
    Private Sub btnEnter_Click(sender As System.Object, e As System.EventArgs) Handles btnEnter.Click
        sol1 = cbSolve1.Text
        sol2 = cbSolve2.Text
        sol3 = cbSolve3.Text
        sol4 = cbSolve4.Text
        given1 = cbGiven1.Text
        given2 = cbGiven2.Text
        given3 = cbGiven3.Text
        given4 = cbGiven4.Text

        REM Solving Row #1
        REM Blue Block
        If sol1 = "Blue" And given1 = "Green" Then
            answer1 = "1x Left"
        ElseIf sol1 = "Blue" And given1 = "Red" Then
            answer1 = "2x Left"
        ElseIf sol1 = "Blue" And given1 = "Purple" Then
            answer1 = "3x Either Way"
        ElseIf sol1 = "Blue" And given1 = "White" Then
            answer1 = "2x Right"
        ElseIf sol1 = "Blue" And given1 = "Yellow" Then
            answer1 = "1x Right"
            REM Green Block
        ElseIf sol1 = "Green" And given1 = "Blue" Then
            answer1 = "1x Right"
        ElseIf sol1 = "Green" And given1 = "Red" Then
            answer1 = "1x Left"
        ElseIf sol1 = "Green" And given1 = "Purple" Then
            answer1 = "2x Left"
        ElseIf sol1 = "Green" And given1 = "White" Then
            answer1 = "3x Either Way"
        ElseIf sol1 = "Green" And given1 = "Yellow" Then
            answer1 = "2x Right"
            REM Red Block
        ElseIf sol1 = "Red" And given1 = "Blue" Then
            answer1 = "2x Right"
        ElseIf sol1 = "Red" And given1 = "Green" Then
            answer1 = "1x Right"
        ElseIf sol1 = "Red" And given1 = "Purple" Then
            answer1 = "1x Left"
        ElseIf sol1 = "Red" And given1 = "White" Then
            answer1 = "2x Left"
        ElseIf sol1 = "Red" And given1 = "Yellow" Then
            answer1 = "3x Either Way"
            REM Purple Block
        ElseIf sol1 = "Purple" And given1 = "Blue" Then
            answer1 = "3x Either Way"
        ElseIf sol1 = "Purple" And given1 = "Green" Then
            answer1 = "2x Right"
        ElseIf sol1 = "Purple" And given1 = "Red" Then
            answer1 = "1x Right"
        ElseIf sol1 = "Purple" And given1 = "White" Then
            answer1 = "1x Left"
        ElseIf sol1 = "Purple" And given1 = "Yellow" Then
            answer1 = "2x Left"
            REM White Block
        ElseIf sol1 = "White" And given1 = "Blue" Then
            answer1 = "2x Left"
        ElseIf sol1 = "White" And given1 = "Green" Then
            answer1 = "3x Either Way"
        ElseIf sol1 = "White" And given1 = "Red" Then
            answer1 = "2x Right"
        ElseIf sol1 = "White" And given1 = "Purple" Then
            answer1 = "1x Right"
        ElseIf sol1 = "White" And given1 = "Yellow" Then
            answer1 = "1x Left"
            REM Yellow Block
        ElseIf sol1 = "Yellow" And given1 = "Blue" Then
            answer1 = "1x Left"
        ElseIf sol1 = "Yellow" And given1 = "Green" Then
            answer1 = "2x Left"
        ElseIf sol1 = "Yellow" And given1 = "Red" Then
            answer1 = "3x Either Way"
        ElseIf sol1 = "Yellow" And given1 = "Purple" Then
            answer1 = "2x Right"
        ElseIf sol1 = "Yellow" And given1 = "White" Then
            answer1 = "1x Right"
        End If
        REM Solving Row #2
        REM Blue Block
        If sol2 = "Blue" And given2 = "Green" Then
            answer2 = "1x Left"
        ElseIf sol2 = "Blue" And given2 = "Red" Then
            answer2 = "2x Left"
        ElseIf sol2 = "Blue" And given2 = "Purple" Then
            answer2 = "3x Either Way"
        ElseIf sol2 = "Blue" And given2 = "White" Then
            answer2 = "2x Right"
        ElseIf sol2 = "Blue" And given2 = "Yellow" Then
            answer2 = "1x Right"
            REM Green Block
        ElseIf sol2 = "Green" And given2 = "Blue" Then
            answer2 = "1x Right"
        ElseIf sol2 = "Green" And given2 = "Red" Then
            answer2 = "1x Left"
        ElseIf sol2 = "Green" And given2 = "Purple" Then
            answer2 = "2x Left"
        ElseIf sol2 = "Green" And given2 = "White" Then
            answer2 = "3x Either Way"
        ElseIf sol2 = "Green" And given2 = "Yellow" Then
            answer2 = "2x Right"
            REM Red Block
        ElseIf sol2 = "Red" And given2 = "Blue" Then
            answer2 = "2x Right"
        ElseIf sol2 = "Red" And given2 = "Green" Then
            answer2 = "1x Right"
        ElseIf sol2 = "Red" And given2 = "Purple" Then
            answer2 = "1x Left"
        ElseIf sol2 = "Red" And given2 = "White" Then
            answer2 = "2x Left"
        ElseIf sol2 = "Red" And given2 = "Yellow" Then
            answer2 = "3x Either Way"
            REM Purple Block
        ElseIf sol2 = "Purple" And given2 = "Blue" Then
            answer2 = "3x Either Way"
        ElseIf sol2 = "Purple" And given2 = "Green" Then
            answer2 = "2x Right"
        ElseIf sol2 = "Purple" And given2 = "Red" Then
            answer2 = "1x Right"
        ElseIf sol2 = "Purple" And given2 = "White" Then
            answer2 = "1x Left"
        ElseIf sol2 = "Purple" And given2 = "Yellow" Then
            answer2 = "2x Left"
            REM White Block
        ElseIf sol2 = "White" And given2 = "Blue" Then
            answer2 = "2x Left"
        ElseIf sol2 = "White" And given2 = "Green" Then
            answer2 = "3x Either Way"
        ElseIf sol2 = "White" And given2 = "Red" Then
            answer2 = "2x Right"
        ElseIf sol2 = "White" And given2 = "Purple" Then
            answer2 = "1x Right"
        ElseIf sol2 = "White" And given2 = "Yellow" Then
            answer2 = "1x Left"
            REM Yellow Block
        ElseIf sol2 = "Yellow" And given2 = "Blue" Then
            answer2 = "1x Left"
        ElseIf sol2 = "Yellow" And given2 = "Green" Then
            answer2 = "2x Left"
        ElseIf sol2 = "Yellow" And given2 = "Red" Then
            answer2 = "3x Either Way"
        ElseIf sol2 = "Yellow" And given2 = "Purple" Then
            answer2 = "2x Right"
        ElseIf sol2 = "Yellow" And given2 = "White" Then
            answer2 = "1x Right"
        End If
        REM Solving Row #3
        REM Blue Block
        If sol3 = "Blue" And given3 = "Green" Then
            answer3 = "1x Left"
        ElseIf sol3 = "Blue" And given3 = "Red" Then
            answer3 = "2x Left"
        ElseIf sol3 = "Blue" And given3 = "Purple" Then
            answer3 = "3x Either Way"
        ElseIf sol3 = "Blue" And given3 = "White" Then
            answer3 = "2x Right"
        ElseIf sol3 = "Blue" And given3 = "Yellow" Then
            answer3 = "1x Right"
            REM Green Block
        ElseIf sol3 = "Green" And given3 = "Blue" Then
            answer3 = "1x Right"
        ElseIf sol3 = "Green" And given3 = "Red" Then
            answer3 = "1x Left"
        ElseIf sol3 = "Green" And given3 = "Purple" Then
            answer3 = "2x Left"
        ElseIf sol3 = "Green" And given3 = "White" Then
            answer3 = "3x Either Way"
        ElseIf sol3 = "Green" And given3 = "Yellow" Then
            answer3 = "2x Right"
            REM Red Block
        ElseIf sol3 = "Red" And given3 = "Blue" Then
            answer3 = "2x Right"
        ElseIf sol3 = "Red" And given3 = "Green" Then
            answer3 = "1x Right"
        ElseIf sol3 = "Red" And given3 = "Purple" Then
            answer3 = "1x Left"
        ElseIf sol3 = "Red" And given3 = "White" Then
            answer3 = "2x Left"
        ElseIf sol3 = "Red" And given3 = "Yellow" Then
            answer3 = "3x Either Way"
            REM Purple Block
        ElseIf sol3 = "Purple" And given3 = "Blue" Then
            answer3 = "3x Either Way"
        ElseIf sol3 = "Purple" And given3 = "Green" Then
            answer3 = "2x Right"
        ElseIf sol3 = "Purple" And given3 = "Red" Then
            answer3 = "1x Right"
        ElseIf sol3 = "Purple" And given3 = "White" Then
            answer3 = "1x Left"
        ElseIf sol3 = "Purple" And given3 = "Yellow" Then
            answer3 = "2x Left"
            REM White Block
        ElseIf sol3 = "White" And given3 = "Blue" Then
            answer3 = "2x Left"
        ElseIf sol3 = "White" And given3 = "Green" Then
            answer3 = "3x Either Way"
        ElseIf sol3 = "White" And given3 = "Red" Then
            answer3 = "2x Right"
        ElseIf sol3 = "White" And given3 = "Purple" Then
            answer3 = "1x Right"
        ElseIf sol3 = "White" And given3 = "Yellow" Then
            answer3 = "1x Left"
            REM Yellow Block
        ElseIf sol3 = "Yellow" And given3 = "Blue" Then
            answer3 = "1x Left"
        ElseIf sol3 = "Yellow" And given3 = "Green" Then
            answer3 = "2x Left"
        ElseIf sol3 = "Yellow" And given3 = "Red" Then
            answer3 = "3x Either Way"
        ElseIf sol3 = "Yellow" And given3 = "Purple" Then
            answer3 = "2x Right"
        ElseIf sol3 = "Yellow" And given3 = "White" Then
            answer3 = "1x Right"
        End If
        REM Solving Row # 4
        REM Blue Block
        If sol4 = "Blue" And given4 = "Green" Then
            answer4 = "1x Left"
        ElseIf sol4 = "Blue" And given4 = "Red" Then
            answer4 = "2x Left"
        ElseIf sol4 = "Blue" And given4 = "Purple" Then
            answer4 = "3x Either Way"
        ElseIf sol4 = "Blue" And given4 = "White" Then
            answer4 = "2x Right"
        ElseIf sol4 = "Blue" And given4 = "Yellow" Then
            answer4 = "1x Right"
            REM Green Block
        ElseIf sol4 = "Green" And given4 = "Blue" Then
            answer4 = "1x Right"
        ElseIf sol4 = "Green" And given4 = "Red" Then
            answer4 = "1x Left"
        ElseIf sol4 = "Green" And given4 = "Purple" Then
            answer4 = "2x Left"
        ElseIf sol4 = "Green" And given4 = "White" Then
            answer4 = "3x Either Way"
        ElseIf sol4 = "Green" And given4 = "Yellow" Then
            answer4 = "2x Right"
            REM Red Block
        ElseIf sol4 = "Red" And given4 = "Blue" Then
            answer4 = "2x Right"
        ElseIf sol4 = "Red" And given4 = "Green" Then
            answer4 = "1x Right"
        ElseIf sol4 = "Red" And given4 = "Purple" Then
            answer4 = "1x Left"
        ElseIf sol4 = "Red" And given4 = "White" Then
            answer4 = "2x Left"
        ElseIf sol4 = "Red" And given4 = "Yellow" Then
            answer4 = "3x Either Way"
            REM Purple Block
        ElseIf sol4 = "Purple" And given4 = "Blue" Then
            answer4 = "3x Either Way"
        ElseIf sol4 = "Purple" And given4 = "Green" Then
            answer4 = "2x Right"
        ElseIf sol4 = "Purple" And given4 = "Red" Then
            answer4 = "1x Right"
        ElseIf sol4 = "Purple" And given4 = "White" Then
            answer4 = "1x Left"
        ElseIf sol4 = "Purple" And given4 = "Yellow" Then
            answer4 = "2x Left"
            REM White Block
        ElseIf sol4 = "White" And given4 = "Blue" Then
            answer4 = "2x Left"
        ElseIf sol4 = "White" And given4 = "Green" Then
            answer4 = "3x Either Way"
        ElseIf sol4 = "White" And given4 = "Red" Then
            answer4 = "2x Right"
        ElseIf sol4 = "White" And given4 = "Purple" Then
            answer4 = "1x Right"
        ElseIf sol4 = "White" And given4 = "Yellow" Then
            answer4 = "1x Left"
            REM Yellow Block
        ElseIf sol4 = "Yellow" And given4 = "Blue" Then
            answer4 = "1x Left"
        ElseIf sol4 = "Yellow" And given4 = "Green" Then
            answer4 = "2x Left"
        ElseIf sol4 = "Yellow" And given4 = "Red" Then
            answer4 = "3x Either Way"
        ElseIf sol4 = "Yellow" And given4 = "Purple" Then
            answer4 = "2x Right"
        ElseIf sol4 = "Yellow" And given4 = "White" Then
            answer4 = "1x Right"
        End If

        txtSol4.Text = answer4
        txtSol3.Text = answer3
        txtSol2.Text = answer2
        txtSol1.Text = answer1


    End Sub

    Private Sub btnReset_Click(sender As System.Object, e As System.EventArgs) Handles btnReset.Click
        txtSol4.Text = " "
        txtSol3.Text = " "
        txtSol2.Text = " "
        txtSol1.Text = " "
    End Sub
End Class
