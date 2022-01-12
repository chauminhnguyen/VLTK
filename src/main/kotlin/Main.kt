fun main() {
    println("hello")
    val n1: NhanVat = NhanVat("Nguoi 1", 10, eMonPhai.Nga_My, 100)
    val n2: NhanVat = NhanVat("Nguoi 2", 15, eMonPhai.Cai_Bang, 200)

    val q1: ThongThuong = ThongThuong(15, eHe.He_Kim, 200)
    val q2: DauLinh = DauLinh(20, eHe.He_Tho, 200)

    n1.TakeDamage(q1.he, q1.mucSatThuong)
}