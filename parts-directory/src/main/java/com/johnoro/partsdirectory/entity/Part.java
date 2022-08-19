package com.johnoro.partsdirectory.entity;

import javax.persistence.*;

@Entity
@Table(name = "parts")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "trackingNumber")
    private String trackingNumber;

    @Column(name = "receivedFrom")
    private String receivedFrom;

    @Column(name = "dateExpected")
    private String dateExpected;

    @Column(name = "dateReceived")
    private String dateReceived;

    public Part() {}

    public Part(String name, String trackingNumber, String receivedFrom, String dateExpected, String dateReceived) {
        this.name = name;
        this.trackingNumber = trackingNumber;
        this.receivedFrom = receivedFrom;
        this.dateExpected = dateExpected;
        this.dateReceived = dateReceived;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getTrackingNumber() { return trackingNumber; }

    public void setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; }

    public String getReceivedFrom() { return receivedFrom; }

    public void setReceivedFrom(String receivedFrom) { this.receivedFrom = receivedFrom; }

    public String getDateExpected() { return dateExpected; }

    public void setDateExpected(String dateExpected) { this.dateExpected = dateExpected; }

    public String getDateReceived() { return dateReceived; }

    public void setDateReceived(String dateReceived) { this.dateReceived = dateReceived; }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                "name='" + name + '\'' +
                "trackingNumber='" + trackingNumber + '\'' +
                "receivedFrom='" + receivedFrom + '\'' +
                "dateExpected='" + dateExpected + '\'' +
                "dateReceived='" + dateReceived + '\'' +
                '}';
    }
}
