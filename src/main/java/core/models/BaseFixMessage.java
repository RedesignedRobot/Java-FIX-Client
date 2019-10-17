package core.models;

public class BaseFixMessage {

    private String BeginString;
    private int BodyLength;
    private String MsgType;
    private int MsgSeqNum;
    private String SenderCompID;
    private String SendingTime;
    private String TargetCompID;
    private int EncryptMethod;
    private int CheckSum;



    public String getBeginString() {
        return BeginString;
    }

    public void setBeginString(String beginString) {
        BeginString = beginString;
    }

    public int getBodyLength() {
        return BodyLength;
    }

    public void setBodyLength(int bodyLength) {
        BodyLength = bodyLength;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public int getMsgSeqNum() {
        return MsgSeqNum;
    }

    public void setMsgSeqNum(int msgSeqNum) {
        MsgSeqNum = msgSeqNum;
    }

    public String getSenderCompID() {
        return SenderCompID;
    }

    public void setSenderCompID(String senderCompID) {
        SenderCompID = senderCompID;
    }

    public String getSendingTime() {
        return SendingTime;
    }

    public void setSendingTime(String sendingTime) {
        SendingTime = sendingTime;
    }

    public String getTargetCompID() {
        return TargetCompID;
    }

    public void setTargetCompID(String targetCompID) {
        TargetCompID = targetCompID;
    }

    public int getEncryptMethod() {
        return EncryptMethod;
    }

    public void setEncryptMethod(int encryptMethod) {
        EncryptMethod = encryptMethod;
    }

    public int getCheckSum() {
        return CheckSum;
    }

    public void setCheckSum(int checkSum) {
        CheckSum = checkSum;
    }
}
