package fr.efrei.Domain;

public enum LockingType {
    HL,
    SL_AdminMode,
    SL_UserMode,
    HL_or_SL_AdminMode,
    HL_or_SL_AdminMode_or_SL_UserMode
}