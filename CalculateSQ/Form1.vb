Public Class frmSQ
    Dim income, unspent, sq1, sq2, sq3 As Double
    Private Sub btnCalc_Click(sender As System.Object, e As System.EventArgs) Handles btnCalc.Click
        income = CDbl(txtIncome.Text)
        unspent = CDbl(txtUnspent.Text)
        sq1 = Math.Log(unspent)
        sq2 = 35 * (0.00137 * income - sq1) + 240
        sq3 = FormatNumber(sq2, 2)
        txtSQ.Text = sq3
    End Sub

    Private Sub btnReset_Click(sender As System.Object, e As System.EventArgs) Handles btnReset.Click
        txtIncome.Text = ""
        txtUnspent.Text = ""
        txtSQ.Text = ""

    End Sub
End Class
