interface IInteract {
    fun TakeDamage(object_He: eHe, enemy_He: eHe, enemy_damage: Int) : Int {
        // This object will get amount of damage
        println("$object_He, $enemy_He")

        var damage: Int = enemy_damage
        // Tuong Sinh
        if( (enemy_He == eHe.He_Kim && object_He == eHe.He_Thuy) ||
            (enemy_He == eHe.He_Thuy && object_He == eHe.He_Moc) ||
            (enemy_He == eHe.He_Moc && object_He == eHe.He_Hoa) ||
            (enemy_He == eHe.He_Hoa && object_He == eHe.He_Tho) ||
            (enemy_He == eHe.He_Tho && object_He == eHe.He_Kim)) {
            damage += damage * 10 / 100
        }
        // Tuong Khac
        else if( (enemy_He == eHe.He_Kim && object_He == eHe.He_Moc) ||
            (enemy_He == eHe.He_Moc && object_He == eHe.He_Tho) ||
            (enemy_He == eHe.He_Tho && object_He == eHe.He_Thuy) ||
            (enemy_He == eHe.He_Thuy && object_He == eHe.He_Hoa) ||
            (enemy_He == eHe.He_Hoa && object_He == eHe.He_Kim)) {
            damage += damage * 20 / 100
        }

        else if( (object_He == eHe.He_Kim && enemy_He == eHe.He_Moc) ||
            (object_He == eHe.He_Moc && enemy_He == eHe.He_Tho) ||
            (object_He == eHe.He_Tho && enemy_He == eHe.He_Thuy) ||
            (object_He == eHe.He_Thuy && enemy_He == eHe.He_Hoa) ||
            (object_He == eHe.He_Hoa && enemy_He == eHe.He_Kim)) {
            damage -= damage * 20 / 100
        }
        return damage
    }
}